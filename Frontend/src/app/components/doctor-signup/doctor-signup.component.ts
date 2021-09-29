import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Doctor } from 'src/app/models/doctor.model';
import { DoctorService } from 'src/app/services/doctor.service';

@Component({
  selector: 'app-doctor-signup',
  templateUrl: './doctor-signup.component.html',
  styleUrls: ['./doctor-signup.component.css']
})
export class DoctorSignupComponent implements OnInit {

  doctor?:Doctor;
  doctorEmailId?:string;
  doctorId?: number;
  doctorName?: string;
  doctorForm?:FormGroup;
  constructor(public router:Router,public activatedRoute: ActivatedRoute,public formBuilder:FormBuilder,public doctorService:DoctorService) { }

  ngOnInit(): void {
    this.doctor = new Doctor();
    this.doctorName = this.activatedRoute.snapshot.params['doctorName'];
   // if (this.doctorId == -1) {
      this.doctorForm = this.formBuilder.group({
        doctorEmailId:['',[Validators.required, Validators.pattern('[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[a-z]{2,3}')]],
        doctorName:['', [Validators.required]],
        doctorSpecialisation:['', [Validators.required]],
        doctorPassword:['', [Validators.required, Validators.minLength(8)]],
        contactNo:['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
        city:['', [Validators.required]],
      })
   // }
    // else {
    //   console.log(this.doctorId);
    //   this.doctorService.getDoctorById(this.doctorId)
    //   .subscribe(data =>{
    //     console.log(data),
    //     this.doctor = data
    //         this.doctorForm = this.formBuilder.group({
    //           doctorId:[this.doctor.doctorName, [Validators.required, Validators.min(1)]],
    //           doctorName:[this.doctor.doctorName, [Validators.required, Validators.minLength(5)]],
    //           doctorSpecialisation:['', [Validators.required, Validators.minLength(3)]],
    //           doctorPassword:['', [Validators.required, Validators.minLength(8)]],
    //         })
    //   },
    //    (error: any) => console.log(error)
    //   )
    // }
  }

  saveDoctor(){
    // if (this.doctorId == -1) {
      
      console.log(this.doctorEmailId);

      this.doctorService.saveDoctor(this.doctorForm?.value)
      .subscribe(
        response => {
          console.log(response);
          console.log(this.doctorForm.value);
          console.log("#######Saved successfully ");
          alert("Doctor has been registered succesfully!")
          this.router.navigate(['doctor-login'])
        },
        error => {
          console.log(error);
          console.log(this.doctorId);
          console.log(this.doctorForm.value);
          console.log("Some Error Occurred. Please try again later!");
          this.router.navigate(['doctor-login'])

        }
      )

    // }

    // else {
    //   this.doctorService.updateDoctor(this.doctorForm?.value)
    //   .subscribe(
    //     response => {
    //       console.log(response);
    //       console.log("#######Updated successfully ");
    //       this.router.navigate(['doctor-login'])
    //     });
    // }
  }
  addDoctor(){

    this.router.navigate(['doctor-signup',"-1"]);
  }

  addPatient(){
    this.router.navigate(['signup',"-1"]);
  }


}
