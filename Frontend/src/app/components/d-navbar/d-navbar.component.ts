import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-d-navbar',
  templateUrl: './d-navbar.component.html',
  styleUrls: ['./d-navbar.component.css']
})
export class DNavbarComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }

  getAppointment(){
    console.log("called");  
    this.router.navigate(['view-appiontment']);
  }
}
