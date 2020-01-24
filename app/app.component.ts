// import { Component } from '@angular/core';
// import {User} from './models/user';
  

// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'Akhil Bharadwaj';
//   user= new User(101,'AKhil','bharadwaj16akhil@gmail.com',4786346);
//   message='Hello to child';
//   messageFromChild:string;

//   setMessage(message:string){
//     this.messageFromChild=message;
//   }

// }


import { Component } from '@angular/core';    
    
	@Component({    
    selector: 'app-root',    
    template: `<h2>{{title}}</h2>      
	<p *ngIf="showElement">Show Element</p>      
	<div [ngSwitch]="inpvalue">      
	<p style='color:blue'  *ngSwitchCase="1">You have selected Radhika Apte</p>      
	<p style='color:blue'  *ngSwitchCase="2">You have selected Mallika Sherawat</p>      
	<p style='color:blue'  *ngSwitchCase="3">You have selected Deepika Padukone</p>     
	<p style='color:red'  *ngSwitchDefault>Sorry! Invalid selection....</p>      
	</div>`      
	})    
	export class AppComponent {    
    
		inpvalue: number = 1;    
	}
