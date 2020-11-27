#include <stdio.h>
#include <string.h>

/**
 * 结构体.
 * C数组是存储相同的数据结构,
 * C结构体　
 * 
 */
struct Books
{
    char title[50];
    char author[50];
    char subject[100];
    int book_id;
} book = {"C语言","RNNOOB","编程语言",123456};


struct bs
{
    int a:8;
    int b:2;
    int c:6;
};

union Data
{
    int i;
    float f;
    char str[20];
};

struct 
{
    unsigned int age : 3;

} Age;


int main(){
    char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\0'};

    printf("Greeting message : %s\n" , greeting);

    printf(" ------------------  华丽分割线 -------------------- \n");

    char str1[12] = "Hello";
    char str2[12] = "world";
    char str3[12];
    int len;
    
    // 将str1的内容复制到 str3
    strcpy(str3,str1);
    printf("调用strcpy后的str3值: %s\n" , str3);

    // 连接str1和str2, 也就是将 str2 
    strcat(str1,str2);
    printf("strcat(str1,str2) 后的值是: %s\n" , str1);

    // str1　和　str2 连接后的长度
    len = strlen(str1);
    printf("strlen(s1) value is %d\n", len);

    printf(" ------------------  华丽分割线 --------------------- \n");

    printf("title : %s\nauthor: %s\nsubject: %s\nbook_id: %d\n" , book.title,book.author,book.subject,book.book_id);    

    printf(" ------------------  华丽分割线 --------------------- \n");

    struct Books book1;
    struct Books book2;

    // book1　详述
    strcpy(book1.title,"C Programming");
    strcpy(book1.author,"Nuhua Li");
    strcpy(book1.subject,"C Programming Tutorial");
    book1.book_id = 6495407;

    strcpy(book2.title,"Telecom Billing");
    strcpy(book2.author,"Zara Ali");
    strcpy(book2.title,"Telecom Billing Tutorial");
    book2.book_id = 6495700;

    //　输出 book1 信息
    printf( "Book 1 title : %s\n", book1.title);
    printf( "Book 1 author : %s\n", book1.author);
    printf( "Book 1 subject : %s\n", book1.subject);
    printf( "Book 1 book_id : %d\n", book1.book_id);

    // 输出 book2 信息
    printf( "Book 2 title : %s\n", book2.title);
    printf( "Book 2 author : %s\n", book2.author);
    printf( "Book 2 subject : %s\n", book2.subject);
    printf( "Book 2 book_id : %d\n", book2.book_id);

    printf(" ------------------  华丽分割线 --------------------- \n");

    union Data data;

    // printf("Memory size occupied by data : %d\n" , sizeof(data));
    // printf( "Memory size occupied by data : %d\n", sizeof(data));
    data.i = 10;
    data.f = 220.5;
    strcpy(data.str,"C Programming");
    
    printf("data.i : %d\n" , data.i);
    printf("data.f %f\n" , data.f);
    printf("data.str %s\n" , data.str);
    return 0;
}