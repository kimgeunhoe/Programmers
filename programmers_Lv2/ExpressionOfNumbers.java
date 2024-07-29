package programmers_Lv2;

public class ExpressionOfNumbers {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12924
	public static void main(String[] args) {
		int n = 11;
        int answer = 1;
        int sqrt = (int) Math.sqrt(n);
        
        if(n%2==1) {
        	answer++;
        	System.out.println(answer);
        	if(Math.sqrt(n)==sqrt && sqrt%2==1) {
        		answer--;
        	}
        	System.out.println(answer);
        }

        for(int i=2; i<=sqrt; i++) {
        	if(n%i==0) {
        		if(i%2==1) {
        			answer++;
        		}
        		
        		if(n/i%2==1) {
        			answer++;
        		}
        	}
        	System.out.println(answer);
        }
        
        System.out.println(answer);
	}

}
