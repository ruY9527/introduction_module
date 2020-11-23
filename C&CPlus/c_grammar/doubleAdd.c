#include <stdio.h>

int main(){
    int c;
    int a = 10;
    c = a ++;
    printf("先赋值后运算操作 \n");
    printf("++ The value of c is %d\n",c);
    printf("++ The value of a is %d\n",a);

    a = 10;
    c = a --;
    printf("-- The value of c is %d\n",c);
    printf("-- The value of a is %d\n",a);

    printf("先运算符号 : \n");
    a = 10;
    c = ++a;
    printf("++ The value of c is %d\n",c);
    printf("++ The value of a is %d\n",a);

    a = 10;
    c = --a;
    printf("-- The value of c is %d\n",c);
    printf("-- The value of a is %d\n",a);

    return 0;
}