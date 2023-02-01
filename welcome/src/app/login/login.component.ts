// import { Component,OnInit } from '@angular/core';
// import { UserserviceService } from '../userservice.service';


// @Component({
//   selector: 'app-login',
//   templateUrl: './login.component.html',
//   styleUrls: ['./login.component.css']
// })
// export class LoginComponent implements OnInit {
   
//   ngOnInit(): void {
    
//   }

// }
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
// import { Router } from '@angular/router';
import {UserserviceService } from '../userservice.service';

// import { FormGroup, FormControl } from '@angular/forms';
// import { Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  // loginform = new FormGroup({ user: new FormControl('', [Validators.required, Validators.minLength(2), Validators.maxLength(30),Validators.email]), password: new FormControl('', [Validators.required, Validators.minLength(2), Validators.maxLength(30)]) })
  // login() {
  //   console.log(this.loginform);
  // }
  // get user() {
  //   return this.loginform.get('user');
  // }
  // get password() {
  //   return this.loginform.get('password');
  // }
  
  constructor(private ps:UserserviceService) { }
    
insertData(insert:any){
this.ps.insertService(insert.value).subscribe();
alert("Login Submitted")
}
  ngOnInit(): void {

  }
  
  

}