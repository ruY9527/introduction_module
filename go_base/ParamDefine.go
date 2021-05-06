package main

import "fmt"

// 申明全局变量.
var (
	age int
	name string
)

func main()  {

	var name string = "Luohong"
	fmt.Println(name)

	var b,c = 1 , 2
	fmt.Println(b,c)

	var bl bool
	fmt.Println(bl)

	var i int
	var f float64
	var bb bool
	var s string
	fmt.Printf("%v %v %v %q\n",i,f,bb,s)

}