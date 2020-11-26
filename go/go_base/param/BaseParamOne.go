package main

// 实现格式化的IO
import (
	"fmt"
)

const boilingF  = 212

const (
	a = iota
	b = iota
)


func main() {

	var f = boilingF
	var c = (f - 32) * 5 / 9
	fmt.Printf("boiling point = %g°F or %g°C\n",f,c)
	fmt.Printf(" --------- --------- -------- ------- ")

	const freezingF, doubleBoilingF = 32.0 , 212.0
	fmt.Printf("%g°F = %g°C\n", freezingF, fToC(freezingF))
	fmt.Printf("%g°F = %g°C\n", doubleBoilingF, fToC(doubleBoilingF))

	// 利用break提前跳出循环.
	for i := 0; i < 10 ; i++ {
		if(i > 5){
			break
		}
		println(i)
	}

	for j := 0 ; j < 10 ; j ++ {
		if j > 5 { continue }
	}

	// 遍历数组操作.
	 charList := [] string {"a","b","c","d"}
	 for key,value := range charList {
	 	println(key)
	 	println(value)
	 }
}

func fToC(f float64) float64 {
	return (f -32) * 5 / 9
}
