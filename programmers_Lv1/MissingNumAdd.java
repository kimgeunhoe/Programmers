package programmers_Lv1;

public class MissingNumAdd {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 45;
		
		for(int n : numbers) {
			answer -= n;
		}
		
		System.out.println(answer);
	}

}
