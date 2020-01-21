class Hello{

constructor(fname,lname,age){

this.firstName=fname;
this.lastName=lname;
this.Age=age;

}

full_name(){

return this.firstName + ' ' + this.lastName;
}


}

let hello=new Hello('Akhil','Bharadwaj',21);
console.log(hello.full_name());