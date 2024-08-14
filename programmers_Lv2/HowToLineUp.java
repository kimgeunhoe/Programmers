package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class HowToLineUp {
	public static void main(String[] args) {
		int n = 4;
		long k = 5L;
		int[] answer = new int[n];
		List<Integer> list = new ArrayList<>();
		long fac = 1L;
		int num = n - 1;
		int index = 0;
		
		k--;
		
		for(int i=2; i<n; i++) {
			fac *= i;
		}
		
		for(int i=1; i<=n; i++) {
			list.add(i);
		}

		for(int i=0; i<n-1; i++) {
			index = (int)(k / fac % list.size());
			answer[i] = list.get(index);
			list.remove(index);
			fac /= num--;
		}
        
		answer[n-1] = list.get(0);

        for(int a : answer) {
        	System.out.println(a);
        }
	}
	
}
