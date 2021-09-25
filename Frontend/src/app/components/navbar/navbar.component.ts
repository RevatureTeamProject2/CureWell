import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  addPatient(){
    //write the code to navigate -- programmaticallly
    // console.log("Add product called")
    this.router.navigate(['signup',"-1"]);

    
  
   
  }
  addDoctor(){
    this.router.navigate(['doctor-signup',"-1"]);
  }
  

}
