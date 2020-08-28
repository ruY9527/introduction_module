/**
 * JS 标准库学习
 */
// JS 所有其他对象都是继承自 Object 对象.  Object 本身的方法与 Object 实例方法
// Object 自身的方法

// 静态方法,指Object自身的方法
Object.print = function(o) {
    console.log("GT" + o);
}

// new 出来的对象实例方法
Object.prototype.print = function(){
    console.log("GT many beautiful ")
}

Object.prototype.say = function(){
    console.log('说话的操作')
}

Object.print('1111')
Object.say()

var obj = new Object();
obj.print(' benutiful')

console.log('------------分割线---------------')
var arr = [1,2,3]
var dict = {a:'123'}
console.log(Object.prototype.toString.call(dict))


