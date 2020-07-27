/**
 * 函数练习Coding Fos JavaScript
 */

 var print = function(x){
     console.log(typeof x)
 }

 print('111')

 var foo = new Function(
     'return "Hello,World";'
 )

 function fooF(){
     return 'helloWorld';
 }

 function f1(){
     console.log('Time')
 }

console.log(f1.name)

var v = 111;
function f111(){
    console.log(v)
}
f111()

var f = function(argss){
    console.log(arguments[0]);
    console.log(arguments[1]);
    console.log(arguments[2]);
}
f(1,2,3)

/**
 * JS 特有的 链式作用结构,子对象会一级一级向上寻找所有的父对象. 所以父对象的所有变量,对子对象都是可见的,反之不成立
 */

 function createIncrementor(start){
     return function(){
         start ++;
     }
 }

 var inc = createIncrementor(5);

 console.log('-------分割线')
 eval('var a = 1;')
 console.log(a)

 eval('console.log("我是GT")')