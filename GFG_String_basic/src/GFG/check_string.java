package GFG;

public class check_string {
	
	public static  Boolean check (String s)
    {
        // your code here
		int count = 0; 
		char ch = s.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(ch == s.charAt(i)) {
				count++;
			}
		}
		return count == s.length()?   true :  false;
			
    
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("gggg"));

	}

}
//Sample Examples of input : 
//GGGG
//Gggg
//GEEE