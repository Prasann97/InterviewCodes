package main

import (
	"fmt"
)

func main() {
	var x [4]string
	x[0] = "asdfghjkl"
	x[1] = "asdfgpoiu"
	x[2] = "asdfhh"
	x[3] = "asdfghjklmnbgfghyj"
	s1 := Prefix(x[:])
	fmt.Println(s1)
}

func Prefix(arr []string) (s string) {
	var j int = 0
	for true {
		var isNotMatch bool = false
		var prev string = arr[0]
		var c string
		if len(prev) > j {
			c = string(prev[j])
		} else {
			break
		}
		for i := 1; i < len(arr); i++ {
			var str string = arr[i]
			if len(str) > j && string(str[j]) == c {
				continue
			} else {
				isNotMatch = true
				break
			}
		}
		if isNotMatch {
			break
		}
		j++
		s += c
	}
	return s
}
