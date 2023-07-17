package programmers_Lv0;

public class ChickenCoupon {

	public static void main(String[] args) {
		int chicken = 100;
		int answer = 0;
        
        while(chicken>=10) {
        	answer += chicken/10;
        	chicken = chicken/10 + chicken%10;
        }
        
        System.out.println(answer);
	}

}
