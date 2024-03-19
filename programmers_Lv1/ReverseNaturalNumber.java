package programmers_Lv1;

import java.util.Arrays;

public class ReverseNaturalNumber {

	public static void main(String[] args) {
		long n = 12345;
		int length = String.valueOf(n).length();
        int[] answer = new int[length];
 
        for(int i=0; i<length; i++, n/=10) {
            answer[i] = (int)(n%10);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
