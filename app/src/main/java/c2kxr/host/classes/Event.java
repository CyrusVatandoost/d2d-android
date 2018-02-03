package c2kxr.host.classes;

/**
 * Created by Kristian on 2/3/2018.
 */

public class Event {

    private String eventImage;
    private String eventName;
    private String eventOwner;
    private String eventDate;

    public Event(String eventName, String eventOwner, String eventDate) {

        this.eventName = eventName;
        this.eventOwner = eventOwner;
        this.eventDate = eventDate;
    }

    public void setEventImage(String eventImage) {
        this.eventImage = eventImage;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventOwner(String eventOwner) {
        this.eventOwner = eventOwner;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventImage(){
        return this.eventImage;
    }

    public String getEventName(){
        return this.eventName;
    }

    public String getEventOwner(){
        return this.eventOwner;
    }

    public String getEventDate(){
        return this.eventDate;
    }

}
