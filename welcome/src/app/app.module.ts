import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { OrdersComponent } from './orders/orders.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { SpecialityComponent } from './speciality/speciality.component';
import { PopularComponent } from './popular/popular.component';
import { GallaryComponent } from './gallary/gallary.component';
import { ReviewComponent } from './review/review.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RegistrationformComponent } from './registrationform/registrationform.component';

@NgModule({
  declarations: [
   AppComponent,
  HomeComponent,
  LoginComponent,
  SpecialityComponent,
  PopularComponent,
  GallaryComponent,
  ReviewComponent,
  HeaderComponent,
  OrdersComponent,
  FooterComponent,
  RegistrationformComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
