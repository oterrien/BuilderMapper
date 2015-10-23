package com.ote.util.output;

/**
 * Created by Olivier on 23/10/2015.
 */
public class Message {

    private int id;
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
