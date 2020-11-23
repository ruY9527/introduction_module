#include <stdio.h>


/**
 * 变量声明向编译器保证变量以指定的类型和名称存在.
 * 
 * 
 */

// 函数外定义变量 X+
int x;
int y;

int addTwoSum(){

    // 函数内部声明变量 x 和 y 为外部变量
    extern int x;
    extern int y;

    // 给外部变量(全局变量)　x 和 y 赋值
    x = 1;
    y = 2;
    return x + y;
}


int main(){

    int result ;
    result = addTwoSum();
    printf("result 的值是: %d",result);

    return 0;
}