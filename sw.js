function Switchcase(){
    var a,b,d;
a=parseInt(document.getElementById("a").value);
b=parseInt(document.getElementById("b").value);
d=parseInt(document.getElementById("m").value);
                            switch (d) {
    case 1:
        c=a+b;
       //* document.getElementById("ans").innerHTML="The Adiition of "+a+" and "+b+" is "+c";
          break;
    case 2:
          c=a-b;
         //* document.getElementById("ans").innerHTML="The Subtraction of "+a+" and "+b+" is "+c");
          break;
    case 3:
        c=a*b;
        //*document.getElementById("ans").innerHTML="The Multiply of "+a+" and "+b+" is "+c");
        break;
     case 4:
     c=a/b;
     //*document.getElementById("ans").innerHTML="The Division of "+a+" and "+b+" is "+c+");
     break;   
                            }
                        }
