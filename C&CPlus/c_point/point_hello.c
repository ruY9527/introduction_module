#include <stdio.h>

int main(){

    int var_runoob = 10;

    // 定义指针变量 , p 是一个指针, 存储着变量 var_runoob 的地址.
    // 指正p的类型必须与变量var_runoob的类型一致,因为整型的指针只能存储整型变量的指针地址.
    // 指针还是有类型的.
    int *p;
    p = &var_runoob;

    printf("var_runoob 变量的地址值: %p\n" , p);

    return 0;
}