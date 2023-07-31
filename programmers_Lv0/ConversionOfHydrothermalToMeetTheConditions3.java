package programmers_Lv0;

import java.util.Arrays;

public class ConversionOfHydrothermalToMeetTheConditions3 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;

		if(k%2==0) {
            for(int i=0; i<arr.length; i++) {
            	arr[i] = arr[i] + k;   
            }
        } else {
            for(int i=0; i<arr.length; i++) {
            	arr[i] = arr[i] * k;
            }
        }
        
		System.out.println(Arrays.toString(arr));
	}

}
