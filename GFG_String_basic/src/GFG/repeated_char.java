package GFG;

public class repeated_char {
	public static char firstRep(String S) {
     	S = S.toLowerCase();
		char res = '#';
        for(int i=0; i<S.length()-1 ; i++) {
        	for(int j=i+1; j<S.length(); j++) {
        		if(S.charAt(i) == S.charAt(j)) {
        			res= S.charAt(i);
        		}
        	}
        	if(res!='#') {
        		break;
        	}
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(firstRep("abcde"));
	}

}
