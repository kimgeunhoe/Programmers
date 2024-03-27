package programmers_Lv1;

import java.util.Arrays;

public class SortStringAsIWant {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
//		String[] strings = {"sun", "bed", "car"};
//		int n = 1;
		int length = strings.length;
		String[] answer = new String[length];
		
		for(int i=0; i<length; i++) {
			answer[i] = new StringBuilder().append(strings[i].charAt(n)).append(strings[i]).toString();
		}
		
		Arrays.sort(answer);
		
		for(int i=0; i<length; i++) {
			answer[i] = answer[i].substring(1);
		}

		System.out.println(Arrays.toString(answer));
	}

}
