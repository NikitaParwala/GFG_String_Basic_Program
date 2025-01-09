package GFG;

public class remove_common_char_and_concat {
	 public static String concatenatedString(String s1,String s2)
	    {
	        // Your code here

		 	String res = "";
		 	for (int i=0;i<s1.length();i++) {
		 		char ch = s1.charAt(i);
		 		if(s2.indexOf(ch) >=0){
		 			s2 = s2.replace(ch, ' ');
		 			s1 = s1.replace(ch, ' ');
		 		}	
		 	}
		 	res = s1.replaceAll("\\s", "") + s2.replaceAll("\\s", "");
		 	if(res.length() == 0) {
		 		res = "-1";
		 	}
		 
		 return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(concatenatedString("aa", "aa"));

	}

}

/*

Given two strings s1 and s2. Modify both the strings such that all the common characters of s1 and s2 are to be removed and the uncommon characters of s1 and s2 are to be concatenated.
Note: If all characters are removed print -1.

Example 1:

Input:
s1 = aacdb
s2 = gafd
Output: cbgf

Example 2:

Input:
s1 = abcs
s2 = cxzca
Output: bsxz

*/
