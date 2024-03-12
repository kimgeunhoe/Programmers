package programmers_Lv1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		StringBuilder answer = new StringBuilder("");
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> score = new HashMap<>();
        char c = ' ';
        int num = 0;

        for(int i=0; i<survey.length; i++) {
            if(choices[i]!=4) {
                c = choices[i]<4 ? survey[i].charAt(0) : survey[i].charAt(1);
                score.put(c, score.getOrDefault(c, 0) + Math.abs(4 - choices[i]));
            }
        }
        
        for(int i=0; i<type.length; i+=2) {
            num = score.getOrDefault(type[i], 0)>=score.getOrDefault(type[i+1], 0) ? 0 : 1;
            answer.append(type[i + num]);
        }
        
		System.out.println(answer.toString());
	}

}
