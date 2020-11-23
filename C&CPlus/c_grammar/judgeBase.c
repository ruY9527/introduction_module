#include <stdio.h>

/**
 * 
 *　三目表达式coding.
 * 
 */
int main(){
    int num;


    printf("输入一个数字 : ");
    scanf("%d" , &num);

    ( num % 2 == 0) ? printf("偶数"):printf("奇数");

    return 0;
}

/**
 * Get Max　Value.
 */
int maxNumber(int num1,int num2){
    int result;
    if(num1 > num2){
        result = num1;
    } else {
        result = num2;
    }

    return result;
}

/**
 * 函数声明
 * Get Max Value for simple coding.
 */
int getMaxNumber(int num1,int num2){
    return num1 > num2?num1:num2;
}