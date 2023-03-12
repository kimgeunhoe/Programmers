package programmers_Lv1;

public class Cola {

	public static void main(String[] args) {
		int a = 3;
		int b =1;
		int n = 20;
	    int answer = 0;
	    int m = 0;
	    
	    while(n>=a) {
	    	m = n/a*b;
	    	answer += m;
	    	n = n%a + m;
	    }
	    
	    System.out.println(answer);
	}

}
