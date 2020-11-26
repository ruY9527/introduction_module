#include <stdio.h>

const int MAX = 3;

int main(){
    int var [] = {10,100,200};
    int i  , *ptr ;

    ptr = var;

    for (int i=0;i < MAX ; i++) {
        printf("存储地址: var[%d] = %p \n" , i ,ptr);
        printf("存储值: var[%d] = %d\n" , i , *ptr);

        // 指向下一个位置
        ptr ++;
    }

    printf("--------------------  递减  ------------------");

    int varss [] = {10,100,200};
    int j , *next;
    
    next = &var[MAX-1];
    for(j = MAX;j>0;j--){
        printf("存储地址: var[%d] = %p\n", j - 1, next);
        printf("存储值: var[%d] = %d \n" , j - 1, *next);

        // 指向下一个位置
        next --;
    }

    return 0;
}