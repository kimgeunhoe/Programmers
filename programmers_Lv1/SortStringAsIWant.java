package programmers_Lv1;

import java.util.Arrays;

public class SortStringAsIWant {

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
//		String[] strings = {"sun", "bed", "car"};
		int n = 2;
//		int n = 1;
		int l = strings.length;
		String[] answer = new String[l];
		
		for(int i=0; i<l; i++) {
			answer[i] = new StringBuilder().append(strings[i].charAt(n)).append(strings[i]).toString();
		}
		
		Arrays.sort(answer);
		
		for(int i=0; i<l; i++) {
			answer[i] = answer[i].substring(1);
			System.out.println(answer[i]);
		}
	}

}
