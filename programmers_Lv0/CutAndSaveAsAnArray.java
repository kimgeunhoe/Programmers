package programmers_Lv0;

import java.util.Arrays;

public class CutAndSaveAsAnArray {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		int length = my_str.length();
		String[] answer = new String[length/n+(length%n==0 ? 0 : 1)];
		        
		for(int i=0; i<=answer.length-1; i++) {
			answer[i] = my_str.substring(i*n, i==answer.length-1 ? length :(i+1)*n);
		}
		        
		System.out.println(Arrays.toString(answer));
	}

}
