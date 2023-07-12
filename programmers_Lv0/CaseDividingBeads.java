package programmers_Lv0;

public class CaseDividingBeads {

	public static void main(String[] args) {
		int balls = 30;
		int share = 15;
	    long answer = 1;
	    
	    for(int i=1; i<=share; i++) {
	    	answer = answer * balls-- / i;	
	    }

	    System.out.println((int) answer);
	}
	
}
