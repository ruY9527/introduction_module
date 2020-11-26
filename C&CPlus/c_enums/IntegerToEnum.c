#include <stdio.h>
#include <stdlib.h>

int main(){

    enum day{
        saturday,
        sunday,
        monday,
        tuesday,
        wednesday,
        thursday,
        friday
    } workday;

    int a = 1;
    enum day weekend;
    // 类型转化
    weekend = ( enum day ) a;
    printf("weekend : %d " , weekend);

    return 0;
}