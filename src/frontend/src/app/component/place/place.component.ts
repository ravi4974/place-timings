import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Place } from 'src/app/interface/place';
import { TimingSpan } from 'src/app/interface/timing-span';
import { PlaceService } from 'src/app/service/place.service';
import { TimingSpanService } from 'src/app/service/timing-span.service';

@Component({
  selector: 'app-place',
  templateUrl: './place.component.html',
  styleUrls: ['./place.component.css']
})
export class PlaceComponent implements OnInit {

  place!: Place
  timingSpan!: TimingSpan[]

  constructor(private route:ActivatedRoute,private placeService:PlaceService,private timeSpan:TimingSpanService) { }

  ngOnInit(): void {
    this.route.params.subscribe(params=>{
      this.placeService.getPlace(params['id']).subscribe(data=>{
        this.place=data;
        this.timingSpan=this.timeSpan.getTimingSpan(this.place.timings)
      })
    })
  }

}
