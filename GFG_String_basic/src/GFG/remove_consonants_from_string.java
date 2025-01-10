package GFG;

public class remove_consonants_from_string {
	
	static boolean isVowel(char c) {
		
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}return false;
	}
	
	static  public String removeConsonants(String s)
    {
        //code here.
		StringBuilder str = new StringBuilder();
		for(char c:s.toCharArray()) {
			if(isVowel(c)) {
				str.append(c);
			}
		}
		return str.length()>0? str.toString() : "No Vowel";	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeConsonants("rrIty"));
	}
}

/*


Given a string S, remove all consonants and print the modified string that contains vowels only.

Example 1:

Input
S = "abEkipo"
Output
aEio
Explanation : a, E, i, o are only vowels in the string.

Example 2:

Input
S = "rrty"
Output
No Vowel
Explanation: There are no vowels.


*/
