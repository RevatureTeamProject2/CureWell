import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { ContactComponent } from './components/contact/contact.component';
import { PatientLoginComponent } from './components/patient-login/patient-login.component';
import { DoctorLoginComponent } from './components/doctor-login/doctor-login.component';
import { PatientSignupComponent } from './components/patient-signup/patient-signup.component';
import { DoctorSignupComponent } from './components/doctor-signup/doctor-signup.component';
import { BookAppointmentComponent } from './components/book-appointment/book-appointment.component';
import { ViewAppointmentComponent } from './components/view-appointment/view-appointment.component';
import { PatientLoginSuccessComponent } from './components/patient-login-success/patient-login-success.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    AboutusComponent,
    ContactComponent,
    PatientLoginComponent,
    DoctorLoginComponent,
    PatientSignupComponent,
    DoctorSignupComponent,
    BookAppointmentComponent,
    ViewAppointmentComponent,
    PatientLoginSuccessComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
