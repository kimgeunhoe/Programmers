package programmers_Lv1;

import java.util.Arrays;

public class PlaceStringDescending {

	public static void main(String[] args) {
		String s = "Zbcdefg";
	    StringBuilder answer = new StringBuilder();
	    char[] str = s.toCharArray();
	    Arrays.sort(str);
	    
	    for(int i=str.length-1; i>=0; i--) {
	    	answer.append(str[i]);
	    }
	    
	    System.out.println(answer.toString());
	}

}
