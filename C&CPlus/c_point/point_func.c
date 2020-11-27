#include <stdio.h>

int max(int x,int y){
    printf("参数进来的参数 : x is %d , y is %d " , x , y);
    return x > y ? x : y;
}

/**
 *  函数指针.
 * 
 * 
 */
int main(){

    // &可以省略
    int (* p) (int , int)  = & max;

    int a,b,c,d;
    printf("请输入三个数字: ");

    // Note : 这里的格式化,也就是意味着你输入进来的数字也是需要格式化的.
    scanf("%d %d %d" , &a, &b ,&c);

    d =  p(p(a,b),c);
    printf("最大的数字是: %d\n" , d);

    return 0;
}

