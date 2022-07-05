package dataBase.affilate_log;

import java.util.Objects;

public class AffiliateLog {

    public AffiliateLog () {}


    public AffiliateLog(String userMsisdn, String event, String status) {
        this.userMsisdn = userMsisdn;
        this.event = event;
        this.status = status;
    }

    public String userMsisdn;
    public String event;
    public String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AffiliateLog that = (AffiliateLog) o;
        return Objects.equals(userMsisdn, that.userMsisdn) && Objects.equals(event, that.event) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userMsisdn, event, status);
    }


    @Override
    public String toString() {
        return "AffiliateLog{" +
                "userMsisdn='" + userMsisdn + '\'' +
                ", event='" + event + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
