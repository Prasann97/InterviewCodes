package main

import "testing"

func Prefix_test(t *testing.T) {

	x := [4]string{"asdfghjkl", "asdfgpoiu", "asdfhh", "asdfghjklmnbgfghyj"}

	got := Prefix(x[:])
	want := "asdf"

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}
