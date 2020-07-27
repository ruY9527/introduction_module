/**
 * 对象练习Coding
 */

// 键值是数字类型的话,就会自动转化为字符串类型
var obj = {
    foo: 'Hello',
    bar: 'World',
    name: 'GanTian',
    p: function (x) {
        return 2 * x;
    }
}

console.log(obj)
// 根据 key , 从对象中获取出值来
console.log(obj['name'])
console.log(obj.p(3))

var objTwo = {
    p: 'Hello World'
}
console.log(objTwo['p'])

var keyObj = {
    key1: 1,
    key2: 2
}
objKeyList = Object.keys(keyObj)

var selfObj = Object.defineProperty({}, 'p', {
    value: 123,
    configurable: false
})
console.log(selfObj.p)

if ('key1' in keyObj) {
    //  hasOwnProperty 方法判断下,是否为对象自身的属性
    console.log(keyObj.hasOwnProperty('key1'))
}


var itObj = {
    a: 1,
    b: 2
}

for (var i in itObj) {
    console.log(itObj[i])
}

var withObj = {}
with (withObj) {
    pOne = 4;
    pTwo = 5;
}

console.log(withObj.pOne)
console.log(pOne)