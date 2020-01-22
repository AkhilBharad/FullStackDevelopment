export class Employee{

    id:number;
    name:string;
    dob: Date;

    constructor(id:number,name:string,dob:Date){

        this.id=id;
        this.name=name;
        this.dob=dob;
    }
}
let emp=new Employee(101,'Akhil',new Date());
console.log('Date of BIrth:'+ emp.dob);