package programmers_Lv0;

import java.util.Arrays;

public class OperateDifferentlyDependingOnTheLengthOfTheArray {

	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		int length = arr.length;
		        
		for(int i=length%2==1 ? 0 : 1; i<length; i+=2) {
			arr[i] += n;
		}
		        
		System.out.println(Arrays.toString(arr));
	}

}
