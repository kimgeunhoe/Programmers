package programmers_Lv0;

public class AvgOfArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double answer = 0;

        for(int n : numbers) {
        	answer += n;
        }
        
        System.out.println(answer/numbers.length);
	}

}
