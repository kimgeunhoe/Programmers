package programmers_Lv0;

public class DividedByNine {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181914
	public static void main(String[] args) {
		String number = "123";
		int answer = 0;
		        
		for(int i=0; i<number.length(); i++) {
			answer += Character.getNumericValue(number.charAt(i));
		}

		System.out.println(answer % 9);
	}

}
