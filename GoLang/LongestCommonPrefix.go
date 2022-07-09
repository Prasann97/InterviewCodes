package main

import (
	"fmt"
)

func main() {
	var x [4]string
	x[0] = "asdf"
	x[1] = "asdfghj"
	x[2] = "asdfgj"
	x[3] = "asderg"
	s1 := LongestCommonPrefix(x[:])
	fmt.Println(s1)
}

func LongestCommonPrefix(arr []string) (s string) {
	s = arr[0]
	for i, j := 1, 0; i < len(arr); j++ {
		if j < len(arr[i]) && j < len(s) && string(arr[i][j]) == string(s[j]) {
			continue
		} else {
			s = s[0:j]
			i++
			j = -1
		}
	}
	return s
}
