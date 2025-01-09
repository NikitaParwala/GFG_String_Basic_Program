package GFG;

public class remove_vowels_from_string {
	static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}return false;
	}
	
	public static String removeVowels(String S) {
        // code here
		StringBuilder res = new StringBuilder("");
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i);
			if(!isVowel(ch)) {
				res.append(ch);
			}
		}
		
		return res.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeVowels("welcome to geeksforgeeks"));

	}

}
//wlcm t gksfrgks
