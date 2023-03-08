import { Component, HostListener, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{
  
  menuToggle=true;
  mobile=false;
  
  ngOnInit(): void {
    this.mobile=(window.innerWidth<750);
  }
  
  @HostListener('window:resize', ['$event']) 
  onResize(){
      this.mobile=(window.innerWidth<750);
      
  }
  toggle(e:any){
    this.menuToggle=!this.menuToggle;
    console.log("toggled");
  }
  
}
