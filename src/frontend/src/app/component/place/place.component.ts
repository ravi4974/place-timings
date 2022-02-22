import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Place } from 'src/app/interface/place';
import { PlaceService } from 'src/app/service/place.service';

@Component({
  selector: 'app-place',
  templateUrl: './place.component.html',
  styleUrls: ['./place.component.css']
})
export class PlaceComponent implements OnInit {

  place!: Place

  constructor(private placeService:PlaceService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe(params=>{
      this.placeService.getPlace(params['id']).subscribe(data=>{
        this.place=data;
      })
    })
  }

}
