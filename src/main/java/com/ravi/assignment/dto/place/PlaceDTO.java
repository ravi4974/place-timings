package com.ravi.assignment.dto.place;

public class PlaceDTO{

    private int id;
    private String label;
    private String address;

    public PlaceDTO(int id,String label, String address) {
        this.id=id;
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

    
        
}
