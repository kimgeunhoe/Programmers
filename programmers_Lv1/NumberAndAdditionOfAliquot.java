package programmers_Lv1;

public class NumberAndAdditionOfAliquot {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
        int sqrt = 0;
        
        for(int i=left; i<=right; i++) {
        	sqrt = (int)Math.sqrt(i);
        	answer += sqrt*sqrt==i ? i*-1 : i;
        }
		
		System.out.println(answer);
	}

}
