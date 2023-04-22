package programmers_Lv1;

import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		long n = 118372;
        String[] str = String.valueOf(n).split("");
        String num = "";

        Arrays.sort(str);
        
        for(int i=str.length-1; i>=0; i--) {
        	num += str[i];
        }
        
        System.out.println(Long.parseLong(num));
	}

}
