package programmers_Lv1;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		int bool = 0;
		
		for (int i=2; i<=n; i++) {
			bool = 0;
			
			for (int j=2; j<=Math.sqrt(i); j++) {
				if (i%j==0) {
					bool = 1;
					break;
				}
			}
			
			answer += bool==0 ? 1 : 0;
		}

		System.out.println(answer);
	}

}
