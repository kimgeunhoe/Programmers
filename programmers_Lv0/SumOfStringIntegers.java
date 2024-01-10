package programmers_Lv0;

public class SumOfStringIntegers {

	public static void main(String[] args) {
		String num_str = "123456789";
		int answer = 0;
		        
		for(int i=0; i<num_str.length(); i++) {
			answer += Character.getNumericValue(num_str.charAt(i));
		}
		        
		System.out.println(answer);
	}

}
