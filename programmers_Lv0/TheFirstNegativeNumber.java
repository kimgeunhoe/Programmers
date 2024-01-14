package programmers_Lv0;

public class TheFirstNegativeNumber {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181896
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int answer = -1;
		        
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i]<0) {
				answer = i;
				break;
			}
		}
		        
		System.out.println(answer);
	}

}
