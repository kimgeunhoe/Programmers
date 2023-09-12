package programmers_Lv0;

public class FindCompositeNumber {

	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		
		for(int i=4; i<=n; i++) {
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					answer++;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
