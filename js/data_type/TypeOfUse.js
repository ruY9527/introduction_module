// typeOf 是对类型进行判断的
console.log(typeof 123)
console.log(typeof '123')
console.log(typeof false)
var a = {name:'123'}
console.log(typeof a)
// 对类型进行判断,如果是满足条件的话,是可以进行强转的
// 判断最好是使用 === 来进行判断
if (typeof a === Object){
  console.log("a是Object类型");
} else {
  console.log("a不是Object类型");
}

function f(){}
console.log(typeof f)


// -----------------------
console.log('---------------------------分割线---------------------')
if(!''){
  console.log('打印的是false');
}

// 空数组 和 空对象 , 如果是使用到 if 里面的话,对用的都是true
if([] && {}){
  console.log('都是空的打印的是true')
}
