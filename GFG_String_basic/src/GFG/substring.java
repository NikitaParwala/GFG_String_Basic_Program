package GFG;

public class substring {
	
	 public static String javaSub(String S, int L, int R) {
	        // code here
		 
		 String str = S.substring(L, R+1);
		 
		 return str;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(javaSub("cdbkdub", 0, 5));
	}

}
//cdbkdub