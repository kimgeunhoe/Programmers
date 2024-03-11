package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalInformationCollectionValidity {

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		int[] answer = {};
        Map<String, Integer> termsMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        String[] dateSplit = today.split("\\.");
        int date = getDate(dateSplit);
        String alphabet = "";
        
        for(String t : terms) {
        	dateSplit = t.split(" ");
        	termsMap.put(dateSplit[0], Integer.parseInt(dateSplit[1]));
        }
        
        for(int i=0; i<privacies.length; i++) {
        	dateSplit = privacies[i].split("\\.");
        	alphabet = dateSplit[2].substring(3);
        	dateSplit[2] = dateSplit[2].substring(0, 2);
        	
            if(getDate(dateSplit)+termsMap.get(alphabet)*28<=date) {
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i) + 1;
        }
        
        System.out.println(Arrays.toString(answer));
	}

	private static int getDate(String[] date) {
        int year = Integer.parseInt(date[0]) - 1;
        int month = Integer.parseInt(date[1]) - 1;
        int day = Integer.parseInt(date[2]);
        
        return (year * 12 * 28) + (month * 28) + day;
    }
}
