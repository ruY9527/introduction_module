// 条件判断语句

var num:number = 5
if (num > 0) {
    console.log("数字是大于0的");
}

var ifNum : number = 12;
if (ifNum % 2 == 0) {
    console.log("偶数");
} else {
    console.log("奇数");
}

var grade : string = "A";
switch(grade) {
    case "A": {
        console.log("优");
        break;
    }
    case "B": {
        console.log("良");
        break;
    }
    case "C": {
        console.log("及格");
        break;
    }
    case "D": {
        console.log("不及格");
        break;
    }
    default: {
        console.log("输入的值有问题");
        break;
    }
}

