package programmers_Lv0;

public class OddVsEven {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181887
	public static void main(String[] args) {
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0; i<num_list.length; i++) {
			if(i%2==0) {
				evenSum += num_list[i];
			} else {
				oddSum += num_list[i];
			}
		}
		
		System.out.println(Math.max(evenSum, oddSum));
	}

}
