package CTCI;

import java.util.HashMap;

//Write a method to decide if two strings are anagrams or not.

public class anagramCalculator {
	
	public static void main(String args[]) {
	String a = "elves";
	String b = "selve";
	anagramCalculator(a,b);
	}
	public static void anagramCalculator(String a, String b) {
		HashMap<Character, Integer> lettersMap = new HashMap<>();
		HashMap<Character, Integer> lettersMap2 = new HashMap<>();
		for(char c: a.toCharArray()) {
			if(!lettersMap.containsKey(c)) {
				lettersMap.put(c, 1);
			}
			else {
				int n = lettersMap.get(c);
				lettersMap.put(c,n+1);
			}
		}
		for(char c:b.toCharArray()) {
			if(!lettersMap2.containsKey(c)) {
				lettersMap2.put(c, 1);
			}
			else {
				int n = lettersMap2.get(c);
				lettersMap2.put(c,n+1);
			}
		}
		
		if(lettersMap.equals(lettersMap2)) {
			System.out.println("yes, they are anagrams");
		}
		else {
			System.out.println("No they are not anagrams");
		}
	}
}

