package programmers_Lv0;

import java.util.Arrays;

public class SortString2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		char[] arr = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(arr);
        
        System.out.println(String.valueOf(arr));
	}

}
