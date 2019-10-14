package com.mydemos.events5q.model;

import javax.persistence.*;

@Entity
@Table(name = "EVENTS")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private Integer id;
    @Column(name = "title")
    private String eventTitle;
    @Column(name = "description")
    private String eventDescription;
    @Column(name = "venue_id")
    private Integer venueId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public Integer getVenue() {
        return venueId;
    }

    public void setVenue(Integer venueId) {
        this.venueId = venueId;
    }
}
