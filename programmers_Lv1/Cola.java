package programmers_Lv1;

public class Cola {

	public static void main(String[] args) {
		int a = 3;
		int b =1;
		int n = 20;
		int answer = 0;
        int freeCola = 0;
        
        while(n>=a) {
        	freeCola = n/a * b;
        	answer += freeCola;
        	n = n%a + freeCola;
        }
	    
	    System.out.println(answer);
	}

}
