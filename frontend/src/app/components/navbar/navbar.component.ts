import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  menuToggle=true;
  toggle(e:any){
    this.menuToggle=!this.menuToggle;
    console.log("toggled");
  }
  
}
