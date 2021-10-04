import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BookAppointmentService } from 'src/app/services/book-appointment.service';

@Component({
  selector: 'app-book-appointment',
  templateUrl: './book-appointment.component.html',
  styleUrls: ['./book-appointment.component.css']
})
export class BookAppointmentComponent implements OnInit {
 

  AppointmentForm?:FormGroup;
  
  message?:string;
  err?:string;

  constructor(public appointmentService:BookAppointmentService,public router:Router ,public activatedRoute: ActivatedRoute,public formBuilder:FormBuilder){}

  ngOnInit(): void {      
      this.AppointmentForm=this.formBuilder.group({
      // appointmentId:['', [Validators.required, Validators.min(1)]],     
      patientName:['',[Validators.required, Validators.minLength(3)]],    
      reasonToVisit:['',[Validators.required]],
      date:['',[Validators.required]],
      time:['',[Validators.required]],
      consultationFee:['250']
     });
    

   


  }

  saveAppointment(){
    this.appointmentService.saveAppointment(this.AppointmentForm?.value)
        .subscribe(
          response => {
            console.log(response);
            if(response!=null){
              console.log("Booking Successful!");
              this.message="Booked Successfully!";
              this.err="";
              this.router.navigate(['book-appointment']);
            }
            else{
              
              //  console.log("login failed")
              //  this.router.navigate(['patient-login-success'])
            }
           
          },
          error => {
           
            console.log(error);
            this.message="";
            this.err="Some Error Occurred. Please try later!";
            this.router.navigate(['book-appointment'])
            
           
          });
  }

  

}
