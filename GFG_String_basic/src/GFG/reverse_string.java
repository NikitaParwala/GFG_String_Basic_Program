package GFG;

public class reverse_string {

	public static String revStr(String s) {
        // code here
		 return new StringBuilder(s).reverse().toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(revStr("NikitA"));
	}

}
