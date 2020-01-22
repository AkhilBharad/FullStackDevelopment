function display<T>(arg: T): T {    
    return arg;    
}    
let output1 = display<string>("Akhil");    
let output2 = display<number>( 22);  
console.log(output1);  
console.log(output2);  