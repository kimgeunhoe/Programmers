package programmers_Lv0;

import java.util.Arrays;
import java.util.StringTokenizer;

public class SeparateBySpaces2 {

	public static void main(String[] args) {
		String my_string = " i    love  you";
		String[] answer = {};
		StringTokenizer st = new StringTokenizer(my_string, " ");
		int count = st.countTokens();
		
		answer = new String[count];
		
		for(int i=0; i<count; answer[i++]=st.nextToken());
		        
		System.out.println(Arrays.toString(answer));
	}

}
