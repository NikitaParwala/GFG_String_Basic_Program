package GFG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class display_longest_name {
	
	 public static String longest(List<String> names) {
	        // code here
		 String res = "";
		 for(int i=0;i <names.size(); i++) {
			 if(res.length()<names.get(i).length()) {
				 res = names.get(i);
			 }
		 }
		 
		 return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      sc.nextLine(); // Consume the newline character
	      while (t-- > 0) {
	          List<String> names = new ArrayList<>();
	          String input1 = sc.nextLine();
	          Scanner ss1 = new Scanner(input1);
	          while (ss1.hasNext()) {
	              names.add(ss1.next());
	          }
	          display_longest_name obj = new display_longest_name();
	          String res = obj.longest(names);
	          System.out.println(res);
	      
	System.out.println("~");
		}
	}
}

/*
 
 Given a list of names, display the longest name. If there are multiple 
 names of the longest size, return the first occurring name.

Examples1:

Input: names[]= ["Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"]
Output: GeeksforGeeks
Explanation: name "GeeksforGeeks" has maximum length among all names.

Examples2:
Input: names[]=["Apple", "Mango", "Orange", "Banana"]
Output: Orange
Explanation: names "Orange" and "Banana" both have maximum length among all 
names but Orange comes first so answer will be "Orange". 
  
 */
