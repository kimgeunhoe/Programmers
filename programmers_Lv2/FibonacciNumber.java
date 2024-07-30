package programmers_Lv2;

public class FibonacciNumber {

	public static void main(String[] args) {
		int n = 100000;
        int answer = 1;
        int a = 1;
        int b = 1;
        
        for(int i=3; i<=n; i++) {
        	a = answer;
        	answer = (b + answer) % 1234567;
        	b = a;
        }
        
        System.out.println(answer);
	}

}
