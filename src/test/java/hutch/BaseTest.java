package hutch;

import io.qameta.allure.Step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tests.base.BaseForTest;


import static constants.Constants.Urls.*;



public class BaseTest extends BaseForTest {


    @Test
    @Order(1)
    @DisplayName("Check the subscription and unsubscription process by UI")
    public void subUnsubProcessByUI() throws InterruptedException {
        baseLogic
                .open(KIOSK_LANDING_PAGE_HUTCH);
        landingPageLogic
                .clickOnSubscribeBtn();

        baseLogic
                .clickOnMyAccountBtn();
        myAccountPageLogic
                .clickUnsubscribeBtn()
                .clickYesConfirmationBox()
                .clickCloseBtnAfterConfirmUnsub();
    }


}

