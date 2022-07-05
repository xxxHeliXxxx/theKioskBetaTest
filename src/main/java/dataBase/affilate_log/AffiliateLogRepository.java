package dataBase.affilate_log;


import dataBase.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AffiliateLogRepository extends DBConnector {


    public static AffiliateLog getBy(String clientUser) throws SQLException {
        AffiliateLog affiliateLog = new AffiliateLog();

        try {
            Statement statement = ConnectorStageStore().createStatement();

            String SQL = "SELECT x.* FROM `CI_PR-2274-kiosk`.affiliate_log x\n" +
                    "WHERE user_msisdn = '" + clientUser + "'";
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {

                affiliateLog.userMsisdn = rs.getString("user_msisdn");
                affiliateLog.event = rs.getString("event");
                affiliateLog.status = rs.getString("status");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return affiliateLog;
    }

}
