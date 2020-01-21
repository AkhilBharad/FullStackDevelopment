function test() 
{ 
    let num= 100 ;
    console.log("value of num inside test() "+num) 
    {
       console.log("Inner Block ") 
       num = 200 ;
    
       console.log("value of num : "+num)  
    }

    console.log("value of num outside block "+num) 
} 



 test()