#include <stdio.h>
#include <stdlib.h>


/**
 * 回调函数.
 * 
 * 
 */
void populate_array(int *array, size_t arraySize, int (*getNextValue)(void)){
    for(size_t i=0;i<arraySize;i++){
        array[i] = getNextValue();
    }
}

/**
 * 获取随机值.
 */
int getNextRandomValue(void) {
    return rand();
}

/**
 * 启动main函数
 */
int main(){
    int myArray[10];

    // getNextRandomValue() 不能写方法的形式,否则就编译失败. 如果加了()的话,就相当于传入此参数时传入了 int , 而不是函数指针.
    populate_array(myArray,10,getNextRandomValue);
    for(int i=0;i<10;i++){
        printf("%d " , myArray[i]);
    }
    printf("\n");
    return 0;
}