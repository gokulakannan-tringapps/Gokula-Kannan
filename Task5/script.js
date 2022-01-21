const images=["bike1.jpg","bike2.jpg","bike3.jpg","bike4.jpg","bike5.jpg","car1.jpg","car2.jpg","car3.jpg"];
const Mynext=document.getElementById("next");
const Myprevious=document.getElementById("prev");
let i=0;
const myNav=document.querySelectorAll(".navi");
myNav[0].setAttribute("style","background-color: #43f794;");
setInterval(next,3500);
function next(){
    i++;
    if(i>images.length-1){i=0;}
    change(i);
}
Mynext.onclick=next;
Myprevious.addEventListener('click',function(){
    i--;
    if(i<0){i=images.length-1;}
    change(i);
});
function change(y){
    i=y;
    const MyImage=document.getElementById("images");
    MyImage.setAttribute('src',`./images/${images[y]}`);
    for(let x=0;x<myNav.length;x++){
        if(y==x){
            myNav[x].setAttribute("style","background-color: #fad161;");
        }
        else{
            myNav[x].setAttribute("style","background-color: #e6e4e1;");
        }
    }
}
