package elasticSearch;

import base.BaseLogic;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.Operator;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.joda.time.DateTime;

import java.text.SimpleDateFormat;


public class ElasticSearch {


    public static boolean LogExistByType(String logType, String clientName) {
        SearchResponse searchResponse = null;
        try {
            final CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            // Use the username and password that are specified when you create the Elasticsearch cluster. You can also use the username and password to log on to the Kibana console.
            credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials("reporting_tool", "UUq4b7x9BY29BjbT"));

            // Create a Java REST client by using the builder and configure HttpClientConfigCallback for the HTTP client.
            // Specify the public endpoint of the Elasticsearch cluster. You can obtain the endpoint from the Basic Information page of the cluster.
            RestClientBuilder builder = RestClient.builder(new HttpHost("es1.logs.playwing.com", 9200, "http"))
                    .setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
                        @Override
                        public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
                            return httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider);
                        }
                    });

            // Create a RestHighLevelClient instance by using the REST low-level client builder.
            RestHighLevelClient highClient = new RestHighLevelClient(builder);

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
            String lookupIndex = "logstash-piwik-events-kiosk-" + formatter.format(DateTime.now().toDate());

            MatchQueryBuilder mssidnQuery = QueryBuilders.matchQuery("msisdn", clientName).operator(Operator.AND);
            MatchQueryBuilder ecidQuery = QueryBuilders.matchQuery("ec_id", logType).operator(Operator.AND);

            BoolQueryBuilder query = QueryBuilders.boolQuery().must(mssidnQuery).must(ecidQuery);

            SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
            sourceBuilder
                    .query(query)
                    .sort(new FieldSortBuilder("@timestamp").order(SortOrder.DESC))
                    .size(1);
            SearchRequest searchRequest = new SearchRequest()
                    .indices(new String[]{lookupIndex})
                    .source(sourceBuilder);

            searchResponse = highClient.search(searchRequest, RequestOptions.DEFAULT);

            SearchHits hits = searchResponse.getHits();
            for (SearchHit hit : hits) {
                String result = hit.getSourceAsString();
                if (result.contains(logType)) {
                    return true;
                } else {
                    return false;
                }
            }

            highClient.close();

        } catch (Exception exception) {
            return false;
        }
        return false;
    }

}
