package constants;

import org.openqa.selenium.By;

public class Constants {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 10;
    }

    public static class Urls {
        public static final String KIOSK_WHOOPS_PAGE = "http://store.playwing.com/whoops";
        public static final String KIOSK_LANDING_PAGE_HUTCH = "http://pr-2274-kiosk.jenkins.dev-integrations.com/lp?cid=62790278165a7&x=testValue";
        public static final String KIOSK_FAKE_IDENT = "http://thekiosk.store/identification/identify/fake?msisdn=fake-mobilink&carrierId=3002";
        public static final String KIOSK_FAKE_SUB = "http://thekiosk.store/fake/subscribe";
        public static final String KIOSK_FAKE_UNSUB = "http://thekiosk.store/fake/unsubscribe";
    }

    public static class Msisdn {
        public static final String MSISDN_HUTCH_HUTCH = "Hutch_ID_test1234";
    }

    public static class Emails {
        public static final String MY_EMAIL_KIOSK = "oleksii.tilinin@playwing.com";
    }

    public static class Elements {
        public final By MY_ACCOUNT = By.xpath("//div[@class='close-btn']");
        public final By SLIDE_BAR_MENU = By.xpath("//div[@class='close-btn']");
        public final By HEADER_LOGO_BUTTON = By.xpath("//div[@class='close-btn']");
    }


}
