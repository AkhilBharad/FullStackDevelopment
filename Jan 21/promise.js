const myPromise=new Promise((resolve,reject) => {

if(Math.random()*100<90)
{
    resolve('Bagunnara,Bagunnara');
}

reject(new Error('It is rejected'));



});

const onResolved=(resolvedValue) =>console.log(resolvedValue);
const onRejected=(error) =>console.log(error);

myPromise.then(onResolved,onRejected);