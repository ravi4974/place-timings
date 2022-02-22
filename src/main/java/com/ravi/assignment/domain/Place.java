package com.ravi.assignment.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Place {
    @GeneratedValue
    @Id
    private int id;

    private String label;
    private String address;

    @OneToMany(mappedBy = "place")
    private List<Timing> timings;

    public Place() {
    }
    public Place(String label, String address) {
        this.label = label;
        this.address = address;
    }
    
    public Place(int id, String label, String address) {
        this.id = id;
        this.label = label;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Timing> getTimings() {
        return timings;
    }

    public void setTimings(List<Timing> timings) {
        this.timings = timings;
    }

    
}
