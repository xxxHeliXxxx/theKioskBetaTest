package dataBase;

import java.sql.*;

import static common.Config.*;


public class DBConnector {

    public static Connection ConnectorStageBilling() throws SQLException {
        Connection con = DriverManager.getConnection(DB_URL_KIOSK_STAGE_BILLING, DB_USERNAME_KIOSK_STAGE_BILLING, DB_PASSWORD_KIOSK_STAGE_BILLING);
        return con;
    }

    public static Connection ConnectorStageStore() throws SQLException {
        Connection con = DriverManager.getConnection(DB_URL_KIOSK_STAGE_STORE, DB_USERNAME_KIOSK_STAGE_STORE, DB_PASSWORD_KIOSK_STAGE_STORE);
        return con;
    }


}
