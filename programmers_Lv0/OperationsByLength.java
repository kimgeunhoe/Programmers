package programmers_Lv0;

public class OperationsByLength {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181879
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int answer = 0;
		
		if(num_list.length>=11) {
			for(int n : num_list) {
				answer += n;
			}
		} else {
			answer++;
			
			for(int n : num_list) {
				answer *= n;
			}
		}
		   
		System.out.println(answer);
	}

}
