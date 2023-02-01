// import { Injectable,OnInit } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
// export class UserserviceService implements  OnInit{
//   constructor(){}
  
//   ngOnInit(): void {
    
//   }

 
   
// }
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  constructor(private http:HttpClient) { }
  url1="http://localhost:9091/insert"
   url2="http://localhost:9091/insert1"
   url3="http://localhost:9091/insert2"
  
 
 
  insertService(data:any){
    return this.http.post(this.url1,data)
   }
  
  insertOrder(data:any){
    return this.http.post(this.url2,data)
   }
   insertRegister(data:any){
    return this.http.post(this.url3,data)
   }
 
 
   
  

}