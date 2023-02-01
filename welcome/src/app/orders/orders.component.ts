import { Component, OnInit } from '@angular/core';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit  {
  
  constructor(private ps:UserserviceService) { }
    
insertData(insert:any){
this.ps.insertOrder(insert.value).subscribe();
alert("ordered Successfully!!")
}
  ngOnInit(): void {
    
  }
  
  
  

}
