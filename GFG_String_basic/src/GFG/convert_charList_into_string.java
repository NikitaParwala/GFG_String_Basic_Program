package GFG;

public class convert_charList_into_string {
	
	public static String chartostr(char arr[], int N){
        //code here

		return new String(arr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
 		System.out.println(chartostr(arr, 13));
	}

}

/*

Given a list of characters, merge all of them into a string.

Example 1:

Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks 
Explanation: combined all the characters
to form a single string.

Example 2:

Input:
N = 4
Char array = e e b a
Output: eeba
Explanation: combined all the characters
to form a single string.

*/