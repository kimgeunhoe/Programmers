package programmers_Lv0;

public class NumberOfDuplicateNumbers {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;
        int answer = 0;

        for(int a : array) {
        	if(a==n) {
        		answer++;
        	}
        }
        
        System.out.println(answer);
	}

}
