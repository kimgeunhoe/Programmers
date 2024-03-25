package programmers_Lv1;

import java.util.Arrays;

public class SecretMap {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
        	answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]).replace("0", " ").replace("1", "#");
        	
        	if(answer[i].length()<n) {
        		for(int j=answer[i].length(); j<n; j++) {
        			sb.append(" ");
        		}
        		
        		answer[i] = sb.append(answer[i]).toString();
        		sb.setLength(0);
        	}
        }
		
        System.out.println(Arrays.toString(answer));
	}

}
