package main

import (
	"fmt"
	"os"
)

func main() {
	// 定义参数
	var s,spe string
	for i := 1;i<len(os.Args);i++ {
		s += spe + os.Args[i]
		spe = " "
	}
	fmt.Println(s)
}
