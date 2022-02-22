import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllPlacesComponent } from './component/all-places/all-places.component';
import { PlaceComponent } from './component/place/place.component';

const routes: Routes = [
  {
    path: 'place/:id', component:PlaceComponent
  },
  {
    path: '', component: AllPlacesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
