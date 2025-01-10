package GFG;

public class conCat_string {
	
	static String conCat(String s1 , String s2)
	   {
	       //code here.
	       String str = s1.concat(s2);
	       return str;
	   }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(conCat("geeksfor", "geeks"));
	}

}

/*

Given two strings  S1 and S2 . You have to concatenate both the strings and print the concatenated string.

Example 1:

Input:
S1 = "Geeksfor"
S2 = "Geeks"
Output: GeeksforGeeks
Explanation: Combined "Geeksfor" and "Geeks"
 

Example 2:

Input:
S1 = "Practice"
S2 = "Hard"
Output: PracticeHard
Explanation: Combined "Practice" and "Hard"

*?

*/