var arrayName=[1,23,12,4,6,7];
var arrayName1=[2,45,35,3,7,9];
arrayName1=[2,45,35,3,7,9];
console.log(arrayName[4]);
console.log(arrayName1[3]);
var arrayName=new Array(5);
for(var i=0;i<arrayName.length;i++){
    arrayName[i]=i+5;
    console.log(arrayName[i]);
}


var names= new Array("Akhil","Syed","Yasmin","Harshitha");

for(var i=0;i<names.length;i++){

    console.log(names[i]);
}
console.log("Break");
var conc=arrayName.concat(names);
for(var i=0;i<conc.length;i++){

    console.log(conc[i]);
}

