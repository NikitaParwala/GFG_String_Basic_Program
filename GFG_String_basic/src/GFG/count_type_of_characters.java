package GFG;

public class count_type_of_characters {
	static int[] count (String s)
    {
        // your code here
		
		int[] arr = new int[4];
		s = s.replaceAll(" ", "");
		
		for(char c: s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				arr[0]++;
			}else if(Character.isLowerCase(c)) {
				arr[1]++;
			}else if(Character.isDigit(c)) {
				arr[2]++;
			}else {
				arr[3]++;
			}
		}

		return arr;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("#GeeKs01fOr@gEEks07"));
	}

}

/*
 
 
 Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
Note: There are no white spaces in the string.

Example 1:

Input:
S = "#GeeKs01fOr@gEEks07"
Output:
5
8
4
2
Explanation: There are 5 uppercase characters,
8 lowercase characters, 4 numeric characters
and 2 special characters.


*/
