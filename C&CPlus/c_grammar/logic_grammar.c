#include <stdio.h>


/**
 * 逻辑运算符号操作
 * 
 * 
 */
int main(){

    int a = 21;
    int b = 10;
    int c ;
    if (a == b){
        printf("a是等于b的\n");
    } else {
        printf("a是不等于b的\n");
    }
    
    if(a < b){
        printf("a 是小于b的\n");
    } else {
        printf("a 是不小于b的\n");
    }

    if(a > b){
        printf("a 是大于b的\n");
    } else {
        printf("a 不是大于b的\n");
    }

    a = 5;
    b = 20;
    if(a < b){
        printf("a小于等于b \n")
    }
    if(b >= a){
        printf("b是大于等于的\n")
    }
    return 0;
}