package programmers_Lv1;

public class SumAliquot {

	public static void main(String[] args) {
		int n = 121;
		int answer = 0;
		
		if(n==1) {
			System.out.println(1);
		}
		
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				answer += i!=n/i ? i + n/i : i;
			}
		}

		System.out.println(answer);
	}

}
