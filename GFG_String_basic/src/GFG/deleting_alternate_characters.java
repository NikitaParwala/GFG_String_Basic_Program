package GFG;

public class deleting_alternate_characters {
	
	static String delAlternate(String S) {
        // code here
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<S.length(); i++) {
			if(i % 2 == 0) {
				sb.append(S.charAt(i));
			}
		}
		
		return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(delAlternate("nikita"));

	}

}
