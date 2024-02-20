package programmers_Lv1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int n = 10;
		int answer = n - n/2;
        
        for(int i=9; i<=n; i+=2) {
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j==0) {
                    answer--;
                    break;
                }
            }
        }

		System.out.println(answer);
	}

}
