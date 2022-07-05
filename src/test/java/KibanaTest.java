package tests;

import elasticSearch.ElasticSearch;
import io.qameta.allure.Step;

import org.junit.jupiter.api.Test;


import static constants.Constants.Msisdn.MSISDN_HUTCH_HUTCH;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KibanaTest {

    @Test
    @Step("Check the unsubscribe log appears in ElasticSearch piwik conversions board")
    void checkSubLogInKibanaAppears() {
        assertTrue(ElasticSearch.LogExistByType("unsubscribe-click-ok", MSISDN_HUTCH_HUTCH));
    }

    @Test
    @Step("Check the subscribe log appears in ElasticSearch piwik conversions board")
    void checkUnsubLogInKibanaAppears() {
        assertTrue(ElasticSearch.LogExistByType("subscribe-click-ok", MSISDN_HUTCH_HUTCH));
    }



}

