package programmers_Lv1;

public class SumBetweenTwoIntegers {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
//        int min = Math.min(a, b);
//        int max = Math.max(a, b);
//        long answer = min;
//        
//        for(int i=min+1; i<=max; i++) {
//        	answer += i;
//        }

//        System.out.println(answer);
        System.out.println((Math.abs(a-b) + 1) * (a + b) / 2);
	}

}
