import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { BookAppointmentComponent } from './components/book-appointment/book-appointment.component';
import { ContactComponent } from './components/contact/contact.component';
import { DoctorLoginComponent } from './components/doctor-login/doctor-login.component';
import { DoctorSignupComponent } from './components/doctor-signup/doctor-signup.component';
import { HomeComponent } from './components/home/home.component';
import { PatientLoginSuccessComponent } from './components/patient-login-success/patient-login-success.component';
import { PatientLoginComponent } from './components/patient-login/patient-login.component';
import { PatientSignupComponent } from './components/patient-signup/patient-signup.component';
import { ViewAppointmentComponent } from './components/view-appointment/view-appointment.component';


const routes: Routes = [
  { path: '', component:HomeComponent },
  { path: 'patient-login', component:PatientLoginComponent},
  { path: 'doctor-login', component:DoctorLoginComponent},
  { path: 'patient-signup', component:PatientSignupComponent},
  { path: 'doctor-signup', component:DoctorSignupComponent},
  { path: 'about-us', component:AboutusComponent},
  { path: 'book-appointment', component:BookAppointmentComponent},
  { path: 'contact-us', component:ContactComponent},
  { path: 'view-appointment', component:ViewAppointmentComponent},
  { path: 'patient-login-success', component:PatientLoginSuccessComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
