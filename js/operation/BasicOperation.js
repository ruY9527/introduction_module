/**
 * 基本的运算符 Coding 练习
 */

console.log(1 + 1)
console.log(true + false)
console.log('a' + 'bc')

// 对象的 valueOf 方法总是返回对象自身, 此时再調用 toString 方法,将其转化为字符串
var obj = {
    p: 1,
    // 重写了 valueOf 方法
    valueOf: function () {
        return 'GT Beautiful';
    },
    toString: function () {
        return 'GT GT GT Beautiful';
    }
};
// console.log(obj.valueOf())
console.log(obj.toString())

var dateObj = new Date();
dateObj.valueOf = function () { return 1; }
dateObj.toString = function () { return 'GT beautilful'; }
console.log(dateObj + '2')

// 避免负数的正确余数值,先使用绝对值函数
// == 相等运算符   === 严格相等运算符.  ==比较二个值是否相等,严格相等运算符比较它们是否为同一个值
// === 还会比较相同的值二者类型是不是一样的,如果不是一样的话,那么就会返回false的
function isOdd(n) {
    return Math.abs(n % 2) === 1;
}

console.log(2 / 1)
console.log('1' == 1)
console.log(1==='1')
console.log(true === 'true')

console.log(4 >> 1)