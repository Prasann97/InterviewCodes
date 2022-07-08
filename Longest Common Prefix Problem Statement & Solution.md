# Problem Statement

Find longest common prefix in a given set of strings.
Given the array of strings S[], you need to find the longest string S which is the prefix of ALL the
strings in the array.Longest common prefix (LCP) for a pair of strings S1 and S2 is the longest
string S which is the prefix of both S1 and S2.
Write a function to find the longest common prefix string amongst an array of strings. If there is
no common prefix, return an empty string.

## Sample input and output below -

Example 1:
Input: strs = ["flower","flow","flight"]

	Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]

	Output: ""

	Explanation:
	There is no common prefix among the input strings.

Constraints:

	1 <= strs.length <= 200

	0 <= strs[i].length <= 200
	
	strs[i] consists of only lowercase English letters.
	
# Solutions in JAVA
### A. Longest Common Prefix
[Prefix.java](https://github.com/Prasann97/InterviewCodes/blob/main/src/main/java/com/example/demo/Prefix/Prefix.java)

### B. Unit Test Code Of Longest Common Prefix
[PrefixTest.java](https://github.com/Prasann97/InterviewCodes/blob/main/src/test/java/com/example/demo/Prefix/PrefixTest.java)

### C. Alternate Solution Of Longest Common Prefix
[AlternatePrefix.java](https://github.com/Prasann97/InterviewCodes/blob/main/src/main/java/com/example/demo/Prefix/AlternatePrefix.java)

# Solutions in GOLANG
### A. Longest Common Prefix
[Prefix.go](https://github.com/Prasann97/InterviewCodes/blob/main/GoLang/Prefix.go)

# Explaination Of [Prefix.java](https://github.com/Prasann97/InterviewCodes/blob/main/src/main/java/com/example/demo/Prefix/Prefix.java)
•	take variable empty String s for returning

•	take variable j as 0 for taking initial character

•	take while loop it, this will run until it will not break beacause of condition

•	take variable boolean initially as false

•	take variable String prev and it will store 1st element of array

•	take variable char c for storing single character which need to compare

•	check following condition

	if (prev.length() > j) {

		c = prev.charAt(j);
	
		} else {

			break;

	}

Because if string1 =asdfhjkl
And String2=asd
String2 has 3 matching character and code is still running and if we try to compare 4th character of String2 then it will give arrayindexoutofbound exception
So for avoiding this exception need to check with this condition

•	take for loop over array which will start with 1st element till array size for comparing

then take variable String str which will store ith element of array for comparing

again we will put condition

	if (str.length() > j && str.charAt(j) == c) {
	
	continue;
	
	} else {
	
		isNotMatch = true;
	
		break;
	}
In if condition 1st condition is for avoiding arrayindexbound exception and 2nd condition is for comparing jth character with c which have stored charter of 1st element of array

If both condition satified then loop will continues otherwise it will go in else part and in that I have changed isNotMatch flag to true and break the loop

•	after that again if condition over isNotMatch variable if it is true then while loop gets break
otherwise if all works file we will get common character then,j gets incremented for next character to be compare and String s get concatinated with character c 

•	after while loop String s will contain longest prefix string in array and that will be return

