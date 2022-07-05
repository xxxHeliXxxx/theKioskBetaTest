package dataBase.b_processes;

import dataBase.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BProcessesRepository extends DBConnector {

    public static BProcesses getBy(String clientUser, String type) throws SQLException {
        BProcesses bProcesses = new BProcesses();

        try {
            Statement statement = ConnectorStageBilling().createStatement();

            String SQL = "SELECT x.* FROM kiosk_billing_stage_2.b_processes x\n" +
                    "WHERE client_user = '" + clientUser + "'AND type = '" + type + "'";
            ResultSet rs = statement.executeQuery(SQL);
            while (rs.next()) {

                bProcesses.client = rs.getString("client");
                bProcesses.type = rs.getString("type");
                bProcesses.providerUser = rs.getString("provider_user");
                bProcesses.status = rs.getString("status");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return bProcesses;
    }
}

