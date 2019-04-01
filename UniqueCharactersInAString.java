/**
 * Nancode- 100 days of code Apr 1, 2019
 */
package CTCI;

//Question 1 -Implement an algorithm to determine if a string has all unique characters. What if you
//can not use additional data structures?

public class day00 {

	public static void main(String[] args) {
		String input = "lop00";
		if(testUniqueness(input)) {
			System.out.println("Unqiue");
		}
		else{
			System.out.println("not unique");
		}
	}
	
	static boolean testUniqueness(String s){
		//loop one to set one character
		for(int i =0 ; i< s.length(); i++) {
			char c1 = s.charAt(i);
			//loop two to compare character one 
			for(int j = 0; j < i; j++) {
				char c2 = s.charAt(j);
				//if there is a match return false
//				System.out.println("c1: " + c1 + "c2:" + c2);
				if(c1 == c2) {
					return false;
				}
			}
		}
		//if there is no match after finishing botht the loops return true
		return true;
	}

}
