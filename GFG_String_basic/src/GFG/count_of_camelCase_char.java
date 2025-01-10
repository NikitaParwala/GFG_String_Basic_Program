package GFG;

public class count_of_camelCase_char {
	
	static int countCamelCase (String s)
    {
        // your code here 
		int count = 0 ;
		for(char c : s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				count++;
			}
		}
		
		return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countCamelCase("ckjkUUYII"));
	}

}
