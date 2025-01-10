package GFG;

public class string_isIsogram {
	
	static boolean isIsogram(String data){
        //Your code here
		boolean isIso = true;
		for(int i=0; i<data.length()-1; i++) {
			for(int j=i+1; j<data.length(); j++) {
				if(data.charAt(i)==data.charAt(j)) {
					isIso = false;
				}
			}
		}

		return isIso;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsogram("machine"));
	}

}


/* Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.

Example 1:

Input:
S = machine
Output: 1
Explanation: machine is an isogram
as no letter has appeared twice. Hence
we print 1.
Example 2:

Input:
S = geeks
Output: 0
Explanation: geeks is not an isogram
as 'e' appears twice. Hence we print 0.


*/

