package Callback;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

    private String messageContent = "";
    private Date datum;

    Message() {

    }

    public String getMessageContent() {
        return messageContent;
    }
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    public Date getDatum() {
        return datum;
    }
    public void setDatum(Date date) {
        this.datum = date;
    }

    @Override
    public String toString() {
        return "ByValue.Message{" +
                "messageContent='" + messageContent + '\'' +
                ", datum=" + datum +
                '}';
    }
}
