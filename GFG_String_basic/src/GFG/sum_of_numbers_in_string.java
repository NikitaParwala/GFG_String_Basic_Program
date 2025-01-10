package GFG;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;


public class sum_of_numbers_in_string {
	
	 public static long findSum(String str)
	    {
	        // your code here
		 	long sum = 0;
		 	boolean wasDigit = false;
		 	str = str.replaceAll("[^\\d]", " ").trim().replaceAll(" +", " ");

		 	System.out.println(str);
		 	for(char c: str.toCharArray()) {
		 		if(Character.isDigit(c)) {
		 			
		 			sum += str.charAt(c);
		 		}
		 	}
		 return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        System.out.println(findSum("1abc23"));

	}

}
