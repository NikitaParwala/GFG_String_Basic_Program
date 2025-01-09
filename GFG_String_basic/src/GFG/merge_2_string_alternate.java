package GFG;

public class merge_2_string_alternate {

	public static String merge(String S1, String S2)
    { 
        // code here
		StringBuilder ans = new StringBuilder("");
		int n1 = S1.length(); //5
		int n2 = S2.length();//3
		int i=0;
		while(i<n1 || i<n2) {
			if(i<n1) {
				ans.append(S1.charAt(i));
			}if(i<n2){
				ans.append(S2.charAt(i));
			}
			i++;
		}
		return ans.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(merge("Hello", "Bye"));

	}

}
