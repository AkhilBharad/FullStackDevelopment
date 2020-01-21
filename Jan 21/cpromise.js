var promise=new Promise( function (resolve,reject) {
    setTimeout(resolve,5000)
})

promise.then(function(){

    console.log('This is Done');
})

var asynchronousFunction=function()
{

    return new Promise( function (resolve,reject) {
        console.log('Keep every promise');
        setTimeout(resolve,5000)
    })


}

asynchronousFunction()
.then(asynchronousFunction)
.then(asynchronousFunction)