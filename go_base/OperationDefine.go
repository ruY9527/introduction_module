package main

import "fmt"

func main()  {

	var a int = 21
	var b int = 10
	var c int

	c = a + b
	fmt.Printf("第一行 - c 的值为 %d\n", c )

	c = a - b
	fmt.Printf("第二行 - c 的值为 %d\n", c )

	c = a * b
	fmt.Printf("第三行 - c 的值为 %d\n", c )

	c = a / b
	fmt.Printf("第四行 - c 的值为 %d\n", c )

	c = a % b
	fmt.Printf("第五行 - c 的值为 %d\n", c )

	a ++
	fmt.Printf("第六行 - a 的值为 %d\n", a )

	a = 21
	a--
	fmt.Printf("第七行 - a 的值为 %d\n", a )

	maxNumber := maxNumber(1, 2)
	fmt.Println(maxNumber)

}

func maxNumber(num1,num2 int) int {

	var result int
	if(num1 > num2){
		result = num1;
	} else {
		result = num2
	}
	return result
}

func swapStr(x,y string) (string,string) {
	return y,x
}