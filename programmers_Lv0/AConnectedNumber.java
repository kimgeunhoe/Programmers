package programmers_Lv0;

public class AConnectedNumber {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181928
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int even = 0;
		int odd = 0;
		
		for(int num : num_list) {
			if(num%2==0) {
				even *= 10;
				even += num;
			} else {
				odd *= 10;
				odd += num;
			}
		}

		System.out.println(even + odd);
	}

}
