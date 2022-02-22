package com.ravi.assignment.controller;

import java.util.List;
import java.util.Optional;

import com.ravi.assignment.domain.Place;
import com.ravi.assignment.repository.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
@RestController
public class PlaceController {
    
    @Autowired
    private PlaceRepository placeRepository;

    @GetMapping("places")
    public ResponseEntity<List<Place>> getPlaces(){
        return new ResponseEntity<>(placeRepository.findAll(),HttpStatus.OK);
    }

    @GetMapping("/places/{id}")
    public ResponseEntity<Place> getPlace(@PathVariable("id") int id){
        Optional<Place> placeById=placeRepository.findById(id);

        if(placeById.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        Place place=placeById.get();

        return new ResponseEntity<>(place,HttpStatus.OK);
    }
}
