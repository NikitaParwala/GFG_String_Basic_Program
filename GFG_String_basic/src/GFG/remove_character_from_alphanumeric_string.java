package GFG;

public class remove_character_from_alphanumeric_string {
	
	static  String removeCharacters(String S) {
        // code here
		StringBuilder sb = new StringBuilder();
		for(char c : S.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
		
		return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeCharacters("abc6729f1hq"));

	}

}

/*


Remove all characters except the numeric characters from an alphanumeric string.

Example 1:

Input: S = "AA1d23cBB4"
Output: 1234
Explanation: Remove all characters
other than numbers
Example 2:

Input: S = "a1b2c3"
Output: 123
Explanation: Remove all characters
other than numbers


*/