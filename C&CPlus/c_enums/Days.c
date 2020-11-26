#include <stdio.h>

enum DAY {
    MON=1,TUE,WED,THU,FRI,SAT,SUN
};

int main(){
    enum DAY day;
    day = WED;
    printf("%d",day);

    for(day = MON;day <= SUN; day ++) {
        printf("枚举元素：%d \n" , day);
    }
    
    return 0;
}