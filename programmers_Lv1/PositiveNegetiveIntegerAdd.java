package programmers_Lv1;

public class PositiveNegetiveIntegerAdd {
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		int answer = 0;
		
		for(int i=0; i<absolutes.length; i++) {
			answer += signs[i] ? absolutes[i] :  -absolutes[i];
		}
		
		System.out.println(answer);
	}
}
