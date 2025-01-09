package GFG;

public class divisible_by_four {
	
	static int divisibleBy4 (String N)
    {
        // Your Code Here
		int a = Integer.parseInt(N);
		if(a % 4 == 0) {
			return 1;
		}
		else {
			return 0;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(divisibleBy4("987565544446655676"));
	}

}
