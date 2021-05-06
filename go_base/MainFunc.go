package main

/*
* @author luohong
*/
import (
	"fmt"
)

func main(){
	fmt.Println("This is hello world.")

	// 字符串拼接操作
	fmt.Println(" this is " + " luohong's name")

	var stockCode = 123
	var endDate = "2021-05-06"
	var url="Code=%d&endDate=%s"
	var targetUrl = fmt.Sprintf(url,stockCode,endDate)
	fmt.Println(targetUrl)

}
