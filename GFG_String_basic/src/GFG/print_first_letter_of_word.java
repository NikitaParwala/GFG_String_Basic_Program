package GFG;

public class print_first_letter_of_word {
	
	public static String firstAlphabet(String S) {
        // code here
		String res = ""+S.charAt(0);
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == ' ') {
				res += S.charAt(i+1);
			}
		}
		
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstAlphabet("geeks for geeks"));
		
	}

}
