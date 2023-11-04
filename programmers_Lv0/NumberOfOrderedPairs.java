package programmers_Lv0;

public class NumberOfOrderedPairs {

	public static void main(String[] args) {
		int n = 100;
		int answer = 0;
		int num = (int) Math.sqrt(n);
        
        for(int i=1; i<=num; i++) {
        	if(n%i==0) {
        		answer++;
        	}
        }
        
        System.out.println(answer * 2 - (num*num==n ? 1 : 0));
	}

}
