package programmers_Lv0;

import java.util.Arrays;

public class CutList {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181897
	public static void main(String[] args) {
		int n = 3;
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int a = n>1 ? slicer[0] : 0;
		int b = n==2 ? num_list.length : slicer[1] + 1;
		int c = n==4 ? slicer[2] : 1;
		int index = 0;
		int[] answer = new int[(b-a-1)/c + 1];
		
		for(; a<b; answer[index++]=num_list[a], a+=c);

		System.out.println(Arrays.toString(answer));
	}

}
