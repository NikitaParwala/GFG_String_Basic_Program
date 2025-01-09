package GFG;

import java.util.ArrayList;
import java.util.List;

public class uppercase_conversion {

	public static String convert(String s) {
        // code here
		String res = "";
		
		res += Character.toUpperCase(s.charAt(0));
		for(int i=1; i<s.length();i++) {
			if(s.charAt(i-1) == ' ') {
				res += Character.toUpperCase(s.charAt(i));
			}else {
				res += s.charAt(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("i love coding"));
	}

}
