package GFG;

public class count_of_camelCase_char {
	
	static int countCamelCase (String s)
    {
        // your code here 
		int count = 0 ;
		for(char c : s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		
		return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countCamelCase("ckjkUUYII"));
	}

}

/*

Given a string. Count the number of Camel Case characters in it.

Example 1:

Input:
S = "ckjkUUYII"
Output: 5
Explanation: Camel Case characters present:
U, U, Y, I and I.

â€‹Example 2:

Input: 
S = "abcd"
Output: 0
Explanation: No Camel Case character
present.

*/