package programmers_Lv1;

public class SumCipher {

	public static void main(String[] args) {
		int n = 987;
		int m = n;
	    int answer = 0;

	    while(m>=1) {
	    	answer += m%10;
	    	m /= 10;
	    }
	    
	    System.out.println(answer);
	}

}
