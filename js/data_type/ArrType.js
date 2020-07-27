/**
 * 数组: 其本质就是一个对象,Object
 */

var arr = ['a', 'b', 'c']
console.log(Object.keys(arr))

console.log(['a', 'b', 'c'].length)

// 調用 arr.length = 0 , 可以将数组进行清空
var a = ['a']
a.length = 3
console.log(a)

// 这里如果使用 for in 来对数组进行迭代的话,也会迭代到 非整数键 foo. 
var a = [1,2,3]
a.foo = true 
for (var i in a){
    console.log(a[i])
}

console.log('分割线 ---------------')
for (var i = 0; i < a.length; i++) {
    console.log(a[i]);
}

var aaa = 0;
while(aaa < a.length){
    console.log(a[aaa]);
    aaa ++;
}

var colors = ['red','gerrn','blue']
colors.forEach(function (color){
    console.log(color)
})