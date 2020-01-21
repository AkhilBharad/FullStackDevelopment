class InheritanceDemo{

    constructor(fname,lname,age){
    
    this.firstName=fname;
    this.lastName=lname;
    this.Age=age;
    
    }

}

class Inheritance extends InheritanceDemo{

display(){

console.log('Your Full Name'+ ' '+this.firstName+' '+this.lastName);

}

}

let obj=new Inheritance('Akhil','Bharadwaj',21);
obj.display();