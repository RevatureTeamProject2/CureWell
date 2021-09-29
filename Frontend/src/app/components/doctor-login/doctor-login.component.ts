import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from 'src/app/models/doctor.model';
import { DoctorService } from 'src/app/services/doctor.service';
import { PatientService } from 'src/app/services/patient.service';


declare var success:any;
@Component({
  selector: 'app-doctor-login',
  templateUrl: './doctor-login.component.html',
  styleUrls: ['./doctor-login.component.css']
})
export class DoctorLoginComponent implements OnInit {

  doctor?:Doctor;
  doctorId?: number;
  doctorEmailId?: string;
  doctorPassword?:string;
  doctorLoginForm?:FormGroup;
  errorMessage?:string;
  

  constructor(public patientService:PatientService, public router:Router,public activatedRoute: ActivatedRoute,public formBuilder:FormBuilder,public doctorService:DoctorService) { }

  ngOnInit(): void {

    this.doctor = new Doctor();
     this.doctorLoginForm=this.formBuilder.group({

      doctorEmailId:['', [Validators.required, Validators.pattern('[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[a-z]{2,3}')]],
      doctorPassword:['', [Validators.required, Validators.minLength(8)]],
     
    })
  }

  validateDoctor(){

    this.doctor.doctorEmailId=this.doctorLoginForm.get('doctorEmailId').value;
    this.doctor.doctorPassword= this.doctorLoginForm.get('doctorPassword').value;



    this.doctorService.validateDoctor(this.doctor)
    .subscribe(
      response => {
        console.log(response);
        if(response!=null){
          console.log("Login successful!");
          this.router.navigate(['doctor-dashboard'])
        }
        else{
          this.errorMessage="Invalid Login Credentials";
           console.log("login failed")
           this.router.navigate(['doctor-login'])
        }
        
        
       
      },
      error => {      
             
       console.log("#######Logged successfully ");
       new success();
       this.router.navigate(['doctor-dashboard'])
 
      });


     
   
  }

  addDoctor(){
    this.router.navigate(['doctor-signup',"-1"]);
  }
  addPatient(){
    //write the code to navigate -- programmaticallly
    // console.log("Add product called")
    this.router.navigate(['signup',"-1"]);
  }

}
