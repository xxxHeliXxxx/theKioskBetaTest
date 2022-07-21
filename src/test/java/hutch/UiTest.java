package hutch;

import io.qameta.allure.Step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tests.base.BaseForTest;


import static constants.Constants.Urls.KIOSK_LANDING_PAGE_HUTCH;
import static org.junit.jupiter.api.Assertions.*;

public class UiTest extends BaseForTest {


    @Test
    @DisplayName("Check the price in the 0 paragraph of Terms and Conditions page is correctly displayed for the current carrier")
    public void checkPriceInZeroParagraphOfTnC() {
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        landingPageLogic.clickOnTncBtn();
        String price = "2200 IDR";
        String text = termsAndConditionsPageLogic.getTextFromZeroParagraph().toString();
        assertTrue(text.contains(price));
    }

    @Test
    @DisplayName("Check the banner on Landing page is displayed")
    public void checkTheBannerOnLPisDisplayed() {
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        assertTrue(landingPageLogic.checkTheBannerOnLP());
    }

    @Test
    @DisplayName("Check the price and subscribe period is correctly displayed for the current carrier")
    public void checkThePriceANdPeriodOnLP() {
        String priceAndPeriodHutch = "For only 2200 IDR (VAT incl.) per 3 days";
        driver.get(KIOSK_LANDING_PAGE_HUTCH);
        assertEquals(landingPageLogic.takeTextWithPriceAndPeriodTop(), priceAndPeriodHutch);

    }


}


