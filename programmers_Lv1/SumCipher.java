package programmers_Lv1;

public class SumCipher {

	public static void main(String[] args) {
		int n = 987;
	    int answer = 0;

	    while(n>=1) {
	    	answer += n%10;
	    	n /= 10;
	    }
	    
	    System.out.println(answer);
	}

}
