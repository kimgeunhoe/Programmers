package programmers_Lv0;

import java.util.Arrays;

public class LengthOfArrayElements {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new int[strlist.length];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = strlist[i].length();
        }

        System.out.println(Arrays.toString(answer));
	}

}
