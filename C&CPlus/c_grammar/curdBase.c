#include <stdio.h>

int main(){

    int a = 21;
    int b = 10;
    int c ;
    
    c = a + b;
    printf(" The value of (a+b) is %d\n",c);

    c = a - b;
    printf(" The value of (a-b) is %d\n",c);

    c = a * b;
    printf(" The value of (a*b) is %d\n",c);
  
    c = a / b;
    printf(" The value of (a/b) is %d\n",c);

    c = a % b;
    printf(" The value of (a b) is %d\n" , c);

    c = a++;
    printf(" The value of a ++ is %d\n",c);

    c = a --;
    printf(" The value of a -- is %d\n" , c);

    return 0;
}