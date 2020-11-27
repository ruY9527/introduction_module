#include <stdio.h>

/**
 * 如果执行 gcc 是编译代码的话,那么在执行gcc的时候,是不会去生成文件.
 *  
 * gcc cWriteFile.c -o cWrite.out 
 * ./cWrite.out    ----->   执行这条指令的时候,才是产生文件并且将要写入的内容给写入到文件中去.
 */
int main(){
    FILE *fp = NULL;
    fp =  fopen("/home/adetam/Documents/git_self/introduction_module/C&CPlus/c_file/test.txt","w+");
    fprintf(fp,"This is testing for fprintf....\n");
    fputs("This is testing for fputs....\n",fp);
    fclose(fp);
    return 0;
}