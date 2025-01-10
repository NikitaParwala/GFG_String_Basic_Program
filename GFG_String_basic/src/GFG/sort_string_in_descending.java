package GFG;

import java.util.Arrays;

public class sort_string_in_descending {
	
	static String ReverseSort(String str) 
    { 
        // code here

		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		return new StringBuilder(new String(ch)).reverse().toString();

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseSort("for"));
	}

}

/*


Given a string str containing only lower case alphabets, the task is to sort it in lexicographically-descending order.

Example 1:

Input: str = "geeks"
Output: "skgee"
Explanation: It's the lexicographically-
descending order.
Example 2:

Input: str = "for"
Output: "rof"
Explanation: "rof" is in
lexicographically-descending order.

*/