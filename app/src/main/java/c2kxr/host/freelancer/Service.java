package c2kxr.host.freelancer;

/**
 * Created by Xandra on 03/02/2018.
 */

public class Service {
    private int serviceId;
    private String serviceName;
    private String serviceDesc;
    private int serviceMinPrice;
    private int serviceMaxPrice;


    public Service(int serviceId, String serviceName, String serviceDesc, int serviceMinPrice, int serviceMaxPrice) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDesc = serviceDesc;
        this.serviceMinPrice = serviceMinPrice;
        this.serviceMaxPrice = serviceMaxPrice;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public void setServiceMinPrice(int serviceMinPrice) {
        this.serviceMinPrice = serviceMinPrice;
    }

    public void setServiceMaxPrice(int serviceMaxPrice) {
        this.serviceMaxPrice = serviceMaxPrice;
    }

    public int getServiceId() {
        return this.serviceId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceDesc() {
        return this.serviceDesc;
    }

    public int getServiceMinPrice() {
        return this.serviceMinPrice;
    }

    public int getServiceMaxPrice() {
        return this.serviceMaxPrice;
    }

}
