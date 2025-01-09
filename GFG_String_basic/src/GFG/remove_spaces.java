package GFG;

public class remove_spaces {

	public static String modify(String S){
        // your code here
		
		return S.replaceAll("\\s", "");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(modify("  geeks for geeks"));
	}

}

/*

Given a string, remove spaces from it. 

Example 1:

Input:
S = "geeks  for geeks"
Output: geeksforgeeks
Explanation: All the spaces have been 
removed.

Example 2:

Input: 
S = "    g f g"
Output: gfg
Explanation: All the spaces including
the leading ones have been removed.

*/