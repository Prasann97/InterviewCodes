package com.example.demo.Prefix;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatePrefix { 

	public static String longestPrefix(ArrayList<String> arrayList)
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String str : arrayList) {
			for(int i=1;i<=str.length();i++) {
				String s = str.substring(0, i);
				if(map.containsKey(s)) {
					Integer count = map.get(s);
					count++;
					map.put(s, count);
				}else {
					map.put(s, 1);
				}
				
			}
		}
	String maxString = "";
	int maxO = -1;
	int max = -1;
	
	for (Map.Entry<String,Integer> entry : map.entrySet()) {
        	if(maxO < entry.getKey().length() && entry.getValue() == arrayList.size()) {//max <= entry.getValue() &&  
				maxO = entry.getKey().length();
				max = entry.getValue();
				maxString = entry.getKey();
			}
			
	}
	return maxString;
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
		System.err.println("longestPrefix = "+longestPrefix(arrayList));


	}

}
