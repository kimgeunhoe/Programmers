package programmers_Lv0;

public class AddUntilGreaterThanN {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181884
	public static void main(String[] args) {
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		int answer = 0;
		        
		for(int num : numbers) {
			answer += num;
			
			if(answer>n) {
				break;
			}
		}
		        
		System.out.println(answer);
	}

}
