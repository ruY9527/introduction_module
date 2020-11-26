#include <stdio.h>

int main(){

    // 实际变量的声明
    int var = 20;
    // 指针变量的声明
    int *ip;

    ip = &var;
    printf("var 变量的地址: %p\n" , &var);

    printf("ip 变量存储的地址 : %p\n" , ip);

    printf("ip 变量的值 : %d\n" , *ip);

    int *ptr = NULL;

    // ptr 的地址是: (nil)
    printf(" ptr 的地址是: %p\n" , ptr);

    return 0;
}