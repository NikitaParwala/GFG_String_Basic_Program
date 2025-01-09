package GFG;

public class most_frequent_char {
	
	public static char getMaxOccuringChar(String s) {
		 s = s.toLowerCase();
		char[] arr = new char[26];
		for(int i=0; i<s.length(); i++) {
			char current = s.charAt(i);
			//get index for particular char and add +1
			arr[current - 'a']++;
		}
		int max = arr[0];
		char res = 'a';
		for(int i=0; i<26;i++) {
			//compare max occ with arr
			if(max<arr[i]) {
				System.out.println(arr[i]);
				max=arr[i];
				//convert index value to character value
				res = (char)(i+'a');
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(getMaxOccuringChar("testsample"));
	}

}
//o u t p u t
//testsample
//vo
//a
//ZXCVXZVC