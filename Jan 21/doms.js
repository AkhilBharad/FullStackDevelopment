var paragraphs = document.querySelectorAll('p');
for(var p of paragraphs)    
  p.style.color = 'blue';

  var firstDiv = document.querySelectorAll('div');
for(var div of firstDiv)    
div.style.color = 'red';

var btn = document.querySelector('button');
btn.addEventListener('click', foo);


function foo() { alert('hello'); }

btn.removeEventListener('click',foo);

var pEle = document.createElement('p')


var div = document.querySelector('div');
var strong = document.createElement('strong');
strong.textContent = 'Hello';
div.appendChild(strong);



var yoyo =document.createElement('b');
var strong=document.querySelector('Strong');
yoyo.textContent="Hello Akhil";
div.replaceChild(yoyo,strong);


var copy = strong.cloneNode(true);
div.appendChild(copy);



var div = document.querySelector('div');
div.setAttribute('contenteditable', '')

alert(div.getAttribute('contenteditable'));
















