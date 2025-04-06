package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangularSnail {

	public static void main(String[] args) {
		int n = 4;
		int[] answer = {};

		int count = 1;
		int x = -1;
		int y = 0;
		int num = 0;
		List<int[]> list = new ArrayList<>();
        
		for(int i=1; i<=n; i++) {
			list.add(new int[i]);
		}
		
		for(int i=n; i>=1; i--, count++) {
			for(int j=0; j<i; j++) {
				if(count==1) {
					x++;
				} else if(count==2) {
					y++;
				} else {
					x--;
					y--;
				}
				
				list.get(x)[y] = ++num;
			}
			
			if(count==3) {
				count = 0;
			}
		}
		
		answer = new int[num];
		num = 0;
		
		for(int[] li : list) {
			for(int a : li) {
				answer[num++] = a;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
