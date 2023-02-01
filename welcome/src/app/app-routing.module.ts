import {NgModule } from '@angular/core';
// import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { GallaryComponent } from './gallary/gallary.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { OrdersComponent } from './orders/orders.component';
import { PopularComponent } from './popular/popular.component';
import { RegistrationformComponent } from './registrationform/registrationform.component';
import { ReviewComponent } from './review/review.component';
import { SpecialityComponent } from './speciality/speciality.component';


const routes: Routes = [
  {path:'header', component: HeaderComponent},
  {path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'registration', component: RegistrationformComponent},
  {path:'speciality', component: SpecialityComponent},
  {path:'popular', component: PopularComponent},
  {path:'gallary', component: GallaryComponent},
  {path:'review', component: ReviewComponent},
  {path:'orders', component: OrdersComponent},
  {path:'footer', component: FooterComponent},
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
