var err = new Error('出错了');
console.log(err.message)

try {
    throw 'Has Error';
} catch(e){
    console.log(e)
    console.log('出现了这种异常问题')
}


console.error('这是打印的err级别log')
console.warn('这是打印warn级别log')

var languages = [
    { name: "JavaScript", fileExtension: ".js" },
    { name: "TypeScript", fileExtension: ".ts" },
    { name: "CoffeeScript", fileExtension: ".coffee" }
]

console.table(languages)