package programmers_Lv0;

public class NumberOfK {

	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		int answer = 0;
        String num = "";
		
		for(; i<=j; i++) {
			num = String.valueOf(i);
			answer += num.length() - num.replace(String.valueOf(k), "").length();
		}
		
		System.out.println(answer);
	}

}
