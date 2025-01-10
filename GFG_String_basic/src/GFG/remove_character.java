package GFG;

public class remove_character {

	
	static String removeChars(String string1, String string2){
        // code here
		StringBuilder s = new StringBuilder();
		for(char c: string1.toCharArray()) {
			if(!(string2.indexOf(c) >= 0)) {
				s.append(c);
			}

		}
		return s.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeChars("computer", "cat"));
	}

}

/*

Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".

*/