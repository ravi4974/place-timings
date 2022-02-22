import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from 'rxjs';
import { Place } from '../interface/place';

@Injectable({
  providedIn: 'root'
})
export class PlaceService {
  URL_PREFIX:String = 'http://localhost:8080/api'

  constructor(private http:HttpClient) { }

  getAllPlaces():Observable<Place[]>{
    return this.http.get<Place[]>(`${this.URL_PREFIX}/places`)
  }

  getPlace(id:number):Observable<Place>{
    return this.http.get<Place>(`${this.URL_PREFIX}/places/${id}`);
  }
}
