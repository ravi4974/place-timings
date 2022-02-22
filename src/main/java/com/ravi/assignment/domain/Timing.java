package com.ravi.assignment.domain;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ravi.assignment.enums.Weekday;

@Entity
public class Timing {
    @GeneratedValue
    @Id
    private int id;

    private Instant start;
    private Instant end;
    private Weekday weekday;

    @ManyToOne
    @JoinColumn(name = "PLACE_ID")
    @JsonIgnore
    Place place;

    public Timing() {
    }

    public Timing(Instant start, Instant end, Weekday weekday, Place place) {
        this.start = start;
        this.end = end;
        this.weekday = weekday;
        this.place = place;
    }
    public Timing(int id, Instant start, Instant end, Weekday weekday, Place place) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.weekday = weekday;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    
}
