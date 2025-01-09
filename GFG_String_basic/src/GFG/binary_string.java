package GFG;

public class binary_string {
	public static int binarySubstring(int a, String str)
	{
        // Your code here
		int res = 0;
		for(int i=0;i<a;i++) {
			if(str.charAt(i) == '1') {
				res++; //4
			}
		}
		
		return (res*(res-1))/2;  //(4*(4-1))/2 
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(binarySubstring(9, "001001101"));
	}
}

/*

Given a binary string S. The task is to count the number of substrings 
that start and end with 1. For example, if the input string is “00100101”, 
then there are three substrings “1001”, “100101” and “101”.

Example 1:

Input:
N = 4
S = 1111
Output: 6
Explanation: There are 6 substrings from
the given string. They are 11, 11, 11,
111, 111, 1111.


Example 2:

Input:
N = 5
S = 01101
Output: 3
Explanation: There 3 substrings from the
given string. They are 11, 101, 1101.

*/