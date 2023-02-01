import { Component,OnInit } from '@angular/core';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-registrationform',
  templateUrl: './registrationform.component.html',
  styleUrls: ['./registrationform.component.css']
})
export class RegistrationformComponent  implements OnInit{
  constructor(private ps:UserserviceService) { }
    
  insertData(insert:any){
  this.ps.insertRegister(insert.value).subscribe();
  alert("Register Submitted")
  }
  ngOnInit(): void {
   
  }

}
