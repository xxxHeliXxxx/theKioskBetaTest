package tests;

import io.qameta.allure.Step;
import landingPage.LandingPageElements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import tests.base.BaseForTest;


import static constants.Constants.Urls.KIOSK_LANDING_PAGE_HUTCH;
import static org.junit.jupiter.api.Assertions.*;

public class UiTest extends BaseForTest {


//
//    @AfterEach
//    void tearDown() {
//        driver.close();
//    }


    @Test
    @Step("Check the price in the 0 paragraph of Terms and Conditions page")
    public void checkPriceInZeroParagraphOfTnC(){
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        landingPageLogic.clickOnTncBtn();
        String price = "2200 IDR";
        String text = termsAndConditionsPageLogic.getTextFromZeroParagraph().toString();
        assertTrue(text.contains(price));
    }

    @Test
    @Step("Check the banner on Landing page is displayed")
    public void checkTheBannerOnLPisDisplayed(){
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        assertTrue(landingPageLogic.checkTheBannerOnLP());
    }

    @Test
    @Step("Check the price and subscribe period is correctle displayed for the current carrier")
    public void checkThePriceANdPeriodOnLP() {
        String priceAndPeriodHutch = "For only 2200 IDR (VAT incl.) per 3 days";
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        assertEquals(landingPageLogic.takeTextWithPriceAndPeriodTop(), priceAndPeriodHutch);


    }

}


