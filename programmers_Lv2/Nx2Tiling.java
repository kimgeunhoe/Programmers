package programmers_Lv2;

public class Nx2Tiling {

	public static void main(String[] args) {
		int n = 5;
	    int answer = 5;
	    int num = 3;
	    int pre = 0;
	    
	    if(n<=3) {
	    	answer = n;
	    }
	    
	    for(int i=4; i<=n; i++) {
	    	pre = answer;
	    	answer = (answer + num) % 1000000007;
	    	num = pre;
	    }
	    
	    System.out.println(answer);
	}
}
