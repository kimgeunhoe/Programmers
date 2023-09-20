package programmers_Lv0;

public class FindTheNearest1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181898
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1};
		int idx = 1;
		int answer = -1;
		        
		for(; idx<arr.length; idx++) {
			if(arr[idx]==1) {
				answer = idx;
				break;
			}
		}

		System.out.println(answer);
	}

}
