import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { AddUserComponent } from './add-user/add-user.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path:'register',component:RegisterComponent},
 {path:'',component: HomeComponent},
  {path:'users',component: UsersComponent},
  {path:'add-user',component: AddUserComponent},
  {path:'login',component: LoginComponent}
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
