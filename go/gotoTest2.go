package main

import "fmt"

func main(){
	var C,c int //声明变量
	C = 1 /* 这里不写入 FOR 循环是因为For语句执行之初会将C的值变为1,当我们goto
		A时for语句会重新执行(不是重新一轮循环) */
	A: for C < 100 {
		C++ //C=1不能写入for这里就不能写入
		for c = 2;c < C;c++{
			if C%c == 0 {
				goto A  //若发现因子则不是素数
			}
		}
		fmt.Println(C,"是素数")
	}
}

