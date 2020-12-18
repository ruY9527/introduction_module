var num:number = 5;
var i:number;

var factorial = 1;
for(i=num;i>=1;i--){
    factorial *= i;
}
console.log(factorial);

var j:any;
var n:any = "a b c"
for(j in n){
    console.log(n[j]);
}

let someArray = [1,"string",false]
for(let entry of someArray){
    console.log(entry);
}