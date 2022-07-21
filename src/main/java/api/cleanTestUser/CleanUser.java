package api.cleanTestUser;

import io.restassured.response.Response;


import java.io.IOException;
import java.util.Arrays;


import static io.restassured.RestAssured.given;

public class CleanUser {

    private final static String URL = "http://pr-2274-kiosk.jenkins.dev-integrations.com/";

    public static void main(String[] args) throws IOException {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(200));
        Response response = given()
                .get("private/admin/identification/testuser/c8fc726a-9321-4f2a-8745-42fa224e8c66/dropFromBilling");
        System.out.println(response.asPrettyString());

        System.out.println("http://pr-2274-kiosk.jenkins.dev-integrations.com/check_autologin_url?auth=cd0497538ec64dcf3e6c52513406d252");


//        String urlAdress = "http://pr-2274-kiosk.jenkins.dev-integrations.com/private/admin/identification/testuser/c8fc726a-9321-4f2a-8745-42fa224e8c66/dropUserData";
//        String query = "http://google.com";
//        String queryHelper = "http://pr-2274-kiosk.jenkins.dev-integrations.com/check_autologin_url?auth=05778a78c12b396c2b273b7bcd8095ce";
//       HttpURLConnection connection = null;
//        try {
//            connection = (HttpURLConnection) new URL(urlAdress).openConnection();
//
//            connection.setRequestMethod("GET");
//            connection.setUseCaches(true);
//
//            connection.connect();
//
//            if (HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                System.out.println(connection.getResponseCode());
//            } else {
//                System.out.println("fail " + connection.getResponseCode() + "");
//            }
//        } finally {
//            if (connection != null) {
//                connection.disconnect();
//            }
//        }
//
//
//    }
    }
}
