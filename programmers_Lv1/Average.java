package programmers_Lv1;

public class Average {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		
		for(int a : arr) {
			answer += a;
		}
		
		System.out.println(answer/arr.length);
	}

}
