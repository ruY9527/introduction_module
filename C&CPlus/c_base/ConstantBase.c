#include <stdio.h>


/**
 * 常量是固定的,在程序执行期间是不会修改的.这些固定的值,又叫字面常量.
 * 
 * 
 * 
 */


#define LENGTH 10
#define WIDTH 5
#define NEWLINE '\n'

int main(){

    printf("Hello\tWorld\n\n");

    int area;
    area = LENGTH * WIDTH;
    printf("The value of area : %d " , area);
    printf("%c" , NEWLINE);

    const int LLLL = 10;
    const int WWWW = 5;
    const char NNNN = '\n';

    int aaaa;
    aaaa = LLLL * WWWW;
    printf("The value of aaaa : %d " , aaaa);
    printf("%c",NEWLINE);

    return 0;
}