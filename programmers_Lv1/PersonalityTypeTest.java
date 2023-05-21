package programmers_Lv1;

import java.util.HashMap;
import java.util.Map;

public class PersonalityTypeTest {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		Map<String, Integer> map = new HashMap<>();
		String[] str = {"R", "T", "C", "F", "J", "M", "A", "N"};
		String answer = "";
		
		for(String s : str) {
			map.put(s, 0);
		}
		
		for(int i=0; i<survey.length; i++) {
			if(choices[i]>4) {
				map.put(survey[i].split("")[1], map.get(survey[i].split("")[1]) + choices[i] - 4);
			} else if(choices[i]<4) {
				map.put(survey[i].split("")[0], map.get(survey[i].split("")[0]) + 4-choices[i]);
			}
		}
		
		for(int i=0; i<str.length; i=i+2) {
			answer += map.get(str[i])>=map.get(str[i+1]) ? str[i] : str[i+1];
		}
		
		System.out.println(answer);
	}

}
