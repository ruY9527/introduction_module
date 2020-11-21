package main

import "fmt"

/**
 *   main 方法只能放在 package main中,
 *   go run是执行指令,必须要用一个main来执行.
 *   go build HelloWorld  ---> 即可以在win环境上编译出一个exe文件.
 */
func main(){
	fmt.Println("This is GavinYang World. Tks. ")
}
