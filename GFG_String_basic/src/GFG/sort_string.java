package GFG;

import java.util.Arrays;

public class sort_string {
	
	static String sort1(String s) 
    {
        // code here	
		char[] ch = new char[26];
		
		for(char c : s.toCharArray()) {
			ch[c - 'a'] = c;
		}
		StringBuilder sb = new StringBuilder();
		for(char c : ch) {
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
    }
	
	
	static String sort(String s) {
		
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sort("baioa")); //abcde
	}

}


/*


Given a string consisting of lowercase letters, arrange all its letters in ascending order. 

Example 1:

Input:
S = "edcab"
Output: "abcde"
Explanation: characters are in ascending
order in "abcde".
Example 2:

Input:
S = "xzy"
Output: "xyz"
Explanation: characters are in ascending
order in "xyz".


*/