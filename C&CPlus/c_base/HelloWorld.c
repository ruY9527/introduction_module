#include <stdio.h>
#include <limits.h>
#include <float.h>

/**
 * void 类型指定没有可用的返回值.
 * 1：　函数返回为空,
 * 2:  函数参数为空
 * 3:  指针指向void
 * 
 */
int main(){

    /*  This is notes. 
       gcc HelloWorld.c : 编译C语言代码
    
    */

    // This is simple note.

    printf("The C Language Hello World.");

    printf("int 存储大小: %lu \n " , sizeof(int));

    printf("float 存储最大字节是: %lu \n" , sizeof(float));
    printf("float 最小值: %E\n", FLT_MIN);
    printf("float 最大值: %E\n" , FLT_MAX);
    printf("精度值: %d\n" , FLT_DIG);

    return 0;
}