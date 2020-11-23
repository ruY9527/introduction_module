#include <stdio.h>

// 全局变量声明
int g;

int age = 22;

/**
 * 全局变量: 全局变量保存在内存的全局模式中,占用静态的存储单元.
 * 局部变量: 局部变量保存在栈中,只有在所在的函数被调用时才会动态为变量分配存储单元.
 * 
 */
int main(){
    int a , b ;
    a = 10;
    b = 20;
    g = a + b;
    printf("The value of a = %d, b = %d, g = %d \n" , a,  b ,g);

    int age = 11;
    printf("The value of age = %d\n", age);

    return 0;
}