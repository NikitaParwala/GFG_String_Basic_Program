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
