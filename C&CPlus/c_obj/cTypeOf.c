#include <stdio.h>
#include <string.h>

#define TRUE 1
#define FALSE 0

typedef struct Books
{
    char title[50];
    char author[50];
    char subject[50];
    int book_id;
} Book;


/**
 * typeOf 函数使用. 
 */
int main(){

    Book book;

    strcpy(book.title,"C教程");
    strcpy(book.author,"GavinYang");
    strcpy(book.subject,"编程语言");
    book.book_id = 123456;

    printf( "书标题 : %s\n", book.title);
    printf( "书作者 : %s\n", book.author);
    printf( "书类目 : %s\n", book.subject);
    printf( "书 ID : %d\n", book.book_id);


    printf("TRUE 的值 : %d\n", TRUE);
    printf("FALSE 的值 : %d\n" , FALSE);
    return 0;
}