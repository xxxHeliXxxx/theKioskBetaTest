package common;

public class Config {

    /**
     * Specify do we need the clear cache & cookies
     */
    public static final Boolean CLEAR_COOKIES = true;

    public static final Boolean HOLD_BROWSER_OPEN = false;

    public static final Boolean CLEAR_REPORTS_DIR = true;


    /**
     * THE KIOSK Database stage billing credentials
     */

    public static final String DB_URL_KIOSK_STAGE_BILLING = "jdbc:mariadb://kioskbilling-stage.cb5adfzx36ju.eu-central-1.rds.amazonaws.com:3306";
    public static final String DB_USERNAME_KIOSK_STAGE_BILLING = "admin";
    public static final String DB_PASSWORD_KIOSK_STAGE_BILLING = "WSENTLW3953nAslektgnp5uhtfgn";

    /**
     * THE KIOSK Database stage store credentials
     */

    public static final String DB_URL_KIOSK_STAGE_STORE = "jdbc:mariadb://kioskstore-stage.cb5adfzx36ju.eu-central-1.rds.amazonaws.com:3306";
    public static final String DB_USERNAME_KIOSK_STAGE_STORE = "admin";
    public static final String DB_PASSWORD_KIOSK_STAGE_STORE = "Aldsn2309NQekjntgw34";

}
