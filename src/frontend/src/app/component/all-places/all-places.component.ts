import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Place } from 'src/app/interface/place';
import { PlaceService } from 'src/app/service/place.service';

@Component({
  selector: 'app-all-places',
  templateUrl: './all-places.component.html',
  styleUrls: ['./all-places.component.css']
})
export class AllPlacesComponent implements OnInit {

  places: Place[] = []

  constructor(private placeService: PlaceService, private router: Router) { }

  ngOnInit(): void {
    this.placeService.getAllPlaces().subscribe(data => {
      this.places = data;
    })
  }

  onItemClicked(id:number){
    this.router.navigate(['place',id])
  }

}
