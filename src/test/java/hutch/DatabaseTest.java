package hutch;

import dataBase.affilate_log.AffiliateLog;
import dataBase.affilate_log.AffiliateLogRepository;
import dataBase.b_processes.BProcesses;
import dataBase.b_processes.BProcessesRepository;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {


    @Test
    @DisplayName("Check the subscribe process field in b_process database table")
    @Step("store == kiosk-store, type == subscribe, status == successful, msisdn == Hutch_ID_test1234")
    void checkSubProcessInDatabase() throws SQLException {
        //assert
        BProcesses expected = new BProcesses("kiosk-store", "subscribe", "successful", "Hutch_ID_test1234");
        //act
        BProcesses actual = BProcessesRepository.getBy("Hutch_ID_test1234", "subscribe");
        //arrange
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Check the unsubscribe process field in b_process database table")
    @Step("store == kiosk-store, type == unsubscribe, status == successful, msisdn == Hutch_ID_test1234")
    void checkUnsubProcessInDatabase() throws SQLException {
        //assert
        BProcesses expected = new BProcesses("kiosk-store", "unsubscribe", "successful", "Hutch_ID_test1234");
        //act
        BProcesses actual = BProcessesRepository.getBy("Hutch_ID_test1234", "unsubscribe");
        //arrange
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check the renew process field in b_process database table")
    void checkRenewProcessAfterUnsubInDatabase() throws SQLException {
        //assert
        BProcesses expected = new BProcesses("kiosk-store", "renew", "failed", "Hutch_ID_test1234");
        //act
        BProcesses actual = BProcessesRepository.getBy("Hutch_ID_test1234", "renew");
        //arrange
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("Check the affiliate status process field in affiliate_log database table")
    void checkAffiliateLogInDatabase() throws SQLException {
        //assert
        AffiliateLog expected = new AffiliateLog("Hutch_ID_test1234", "12", "1");
        //act
        AffiliateLog actual = AffiliateLogRepository.getBy("Hutch_ID_test1234");
        //arrange
        assertEquals(expected, actual);
    }


}
