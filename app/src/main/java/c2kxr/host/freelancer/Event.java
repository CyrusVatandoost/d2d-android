package c2kxr.host.freelancer;

/**
 * Created by Xandra on 03/02/2018.
 */

public class Event {
    private int eventId;
    private String eventName;
    private String eventDesc;
    private int eventPrice;
    private int eventBudget;

    public Event(int eventId, String eventName, String eventDesc, int eventPrice, int eventBudget) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDesc = eventDesc;
        this.eventPrice = eventPrice;
        this.eventBudget = eventBudget;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public void setEventPrice(int eventPrice) {
        this.eventPrice = eventPrice;
    }

    public void setEventBudget(int eventBudget) {
        this.eventBudget = eventBudget;
    }

    public int getEventId() {
        return this.eventId;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getEventDesc() {
        return this.eventDesc;
    }

    public int getEventPrice() {
        return this.eventPrice;
    }

    public int getEventBudget() {
        return this.eventBudget;
    }

}
