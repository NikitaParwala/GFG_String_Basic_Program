package GFG;

public class red_or_green {
	
	static int RedOrGreen(int N, String S) {
        //code here
		int Rcount = 0;
		for(int i =0; i<S.length();i++) {
			if(S.charAt(i) == 'R') {
				Rcount++;
			}
		}
		int min = N-Rcount;
		if(min<Rcount) return min;
		else return Rcount;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RedOrGreen(7, "RGRGRGR"));

	}

}
//[0,0,0,0,3,0,0,4]
// 