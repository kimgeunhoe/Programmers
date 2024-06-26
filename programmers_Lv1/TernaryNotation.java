package programmers_Lv1;

public class TernaryNotation {

	public static void main(String[] args) {
		int n = 45;
		int answer = 0;
		String tn = Integer.toString(n, 3);

		for(int i=0; i<tn.length(); i++) {
			answer += Character.getNumericValue(tn.charAt(i))*Math.pow(3, i);
		}
		
		System.out.println(answer);
	}

}
