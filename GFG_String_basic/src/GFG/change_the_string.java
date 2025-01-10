package GFG;

public class change_the_string {
	
	public static String modify(String s){
		//code here
		
		for(char c:s.toCharArray()) {
			
			if(!Character.isDigit(c)) {
				if(Character.isLowerCase(c)) {
					s = s.toLowerCase();
					break;
				}else {
					s = s.toUpperCase();
					break;
				}
				
			}
		}

		return s;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(modify("abCD"));

	}

}


/*


Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.

Example 1:

Input:
S = "abCD"
Output: abcd
Explanation: The first letter (a) is 
lowercase. Hence, the complete string
is made lowercase.


*/