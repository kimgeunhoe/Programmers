package programmers_Lv0;

public class SharingPizza2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/120815
	public static void main(String[] args) {
		int n = 4;
	    int min = Math.min(n, 6);
	    
		for(; min>=1; min--) {
			if(n%min==0 && 6%min==0) {
				break;
			}
		}
		
	    System.out.println(n/min);
	}

}
