package landingPage;

import org.openqa.selenium.By;

public class LandingPageElements {


    public final By subscribeBtn = By.xpath("(//div[@id = 'subscribe-button'])[1]");
    public final By subscribeBtnFooter = By.xpath("(//div[@id = 'subscribe-button'])[1]");


    public final By termsAndConditionsBtn = By.xpath("/html/body/footer/div[1]/div/div/div[3]/a");


    public static final By bannerOnLandingPage = By.xpath("//*[@id=\"main-page-container\"]/div/div[2]/a/img");


    public static final By offerShortPriceAndPeriodText = By.xpath("//div[@class='offer-short'][1]");


}
