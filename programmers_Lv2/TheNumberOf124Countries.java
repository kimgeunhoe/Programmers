package programmers_Lv2;

public class TheNumberOf124Countries {

	public static void main(String[] args) {
		int n = 10;
		char[] num = {'4', '1', '2'};
		int rest = 0;
		StringBuilder answer = new StringBuilder();
		
		do {
			rest = n%3;
			n = rest!=0 ? n/3 : n/3 - 1;
			
			answer.append(num[rest]);
		} while(n>=3);
		
		if(n>0) {
			answer.append(num[n]);
		}
		
		System.out.println(answer.reverse().toString());
	}

}
