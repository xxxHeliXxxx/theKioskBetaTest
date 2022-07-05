package tests;

import io.qameta.allure.Step;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import tests.base.BaseForTest;


import static constants.Constants.Urls.*;
import static constants.texts.HutchTexts.SUCCESSFUL_SUB_TEXT;
import static org.junit.jupiter.api.Assertions.*;


public class BaseTest extends BaseForTest {


    @Test
    @Order(1)
    @Step("Check the subscription and unsubscription process by UI")
    public void subUnsubProcessByUI() throws InterruptedException {
        baseLogic
                .open(KIOSK_LANDING_PAGE_HUTCH);
        landingPageLogic
                .clickOnSubscribeBtn();
        assertEquals(SUCCESSFUL_SUB_TEXT, baseLogic.statusText());

        baseLogic
                .clickOnMyAccountBtn();
        myAccountPageLogic
                .clickUnsubscribeBtn()
                .clickYesConfirmationBox()
                .clickCloseBtnAfterConfirmUnsub();
    }


}

