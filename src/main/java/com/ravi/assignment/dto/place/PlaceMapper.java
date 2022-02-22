package com.ravi.assignment.dto.place;

import com.ravi.assignment.domain.Place;

import org.springframework.stereotype.Component;

@Component
public class PlaceMapper {
    
    public PlaceDTO toDTO(Place place){
        return new PlaceDTO(place.getId(),place.getLabel(), place.getAddress());
    }

    public Place toPlace(PlaceDTO dto){
        return new Place(dto.getId(),dto.getLabel(),dto.getAddress());
    }
}
