package programmers_Lv0;

public class MakeIt1 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181880
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 1, 14};
		int answer = 0;
		
		for(int n : num_list) {
			for(n=n%2==0 ? n : n-1; n>1; n/=2, answer++);
			//answer += Integer.toBinaryString(n).length() - 1;
		}
		
		System.out.println(answer);
	}

}
