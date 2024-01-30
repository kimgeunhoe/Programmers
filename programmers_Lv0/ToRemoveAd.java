package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToRemoveAd {

	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};
		String[] answer = {};
		List<String> list = new ArrayList<>();
		
		for(String s : strArr) {
			if(!s.contains("ad")) {
				list.add(s);
			}
		}
		
		answer = new String[list.size()];
		
		list.toArray(answer);
		        
		System.out.println(Arrays.toString(answer));
	}

}
