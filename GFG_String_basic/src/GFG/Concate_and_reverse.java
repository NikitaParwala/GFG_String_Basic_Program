package GFG;

public class Concate_and_reverse {

	static String conRevstr(String S1, String S2) {
		
        // code here
		String concat = S1.concat(S2);
		
		
		return new StringBuilder(concat).reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(conRevstr("Nikita", "Parwala"));
	}

}
