package dataBase.b_processes;



import java.util.Objects;

public class BProcesses  {
    public BProcesses() {
    }

    public String client;
    public String type;
    public String status;
    public String providerUser;

    public BProcesses(String client, String type, String status, String providerUser) {
        this.client = client;
        this.type = type;
        this.status = status;
        this.providerUser = providerUser;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BProcesses that = (BProcesses) o;
        return Objects.equals(client, that.client) && Objects.equals(type, that.type) && Objects.equals(status, that.status) && Objects.equals(providerUser, that.providerUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, type, status, providerUser);
    }

    @Override
    public String toString() {
        return "BProcesses{" +
                "client='" + client + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", providerUser='" + providerUser + '\'' +
                '}';
    }
}
