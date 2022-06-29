package com.example.demo.Prefix;

import java.util.ArrayList;
import java.util.Scanner;

public class Prefix { 

	public static String prefix(ArrayList<String> arr) {
		String s = "";
		int j = 0;
		while (true) {
			boolean isNotMatch = false;
			String prev = arr.get(0);
			char c;
			if (prev.length() > j) {
				c = prev.charAt(j);
			} else {
				break;
			}
			for (int i = 1; i < arr.size(); i++) {
				String str = arr.get(i);
				if (str.length() > j && str.charAt(j) == c) {
					continue;
				} else {
					isNotMatch = true;
					break;
				}
			}
			if (isNotMatch)
				break;
			j++;
			s += c;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		while(scanner.hasNext()) {
			String string = scanner.nextLine();
			arrayList.add(string);
			if(arrayList.size() == 4) {
				break;
			}
		}
		System.err.println("prefix = "+prefix(arrayList));


	}

}
