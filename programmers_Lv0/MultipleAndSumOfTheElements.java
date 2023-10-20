package programmers_Lv0;

public class MultipleAndSumOfTheElements {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181929
	public static void main(String[] args) {
		int[] num_list = {3, 4, 5, 2, 1};
		int multi = 1;
		int sum = 0;
		
		for(int n : num_list) {
			multi *= n;
			sum += n;
		}

		System.out.println(multi<sum*sum ? 1 : 0);
	}

}
