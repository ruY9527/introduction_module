#include <stdio.h>


/**
 *  auto 存储类是所有局部变量默认的类型.
 *  register: 存储类用于定义了二个带有相同存储类的变量,auto只能在函数内,即auto只能修饰局部变量.
 *  static: 存储类指示编译器在程序的生命周期内保持局部变脸的存在,而不需要在每次进入和离开的作用域时进行创建和销毁.
 *          因此,static修饰局部变量可以在函数调用之间保持局部变量的值.
 *  extern: 存储类用于提供一个全局变量的引用.
 * 
 * 
 * 
 */

// 函数声明
void func1(void);

// 全局变量  static 是默认的.
static int count = 10;

int count ;

extern void write_exter();

int main(){
    count = 5;
    write_exter();

    return 1;
}