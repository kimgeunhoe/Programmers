package programmers_Lv0;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeDelimiters {

	public static void main(String[] args) {
		String myStr = "baconlettucetomato";
		String[] answer = {};
		StringTokenizer st = new StringTokenizer(myStr, "abc");
		int count = st.countTokens();
		
		if(count==0) {
			answer = new String[] {"EMPTY"};
		} else {
			answer = new String[count];
			
			for(int i=0; count-->0; answer[i++]=st.nextToken());
		}

		System.out.println(Arrays.toString(answer));
	}

}
