package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
	private static List<int[]> list;
	
	public static void main(String[] args) {
		int n = 2;
	    int[][] answer = {};

	    list = new ArrayList<>();
        dfs(n, 1, 3, 2);

        answer = new int[list.size()][];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i][0] + " " + answer[i][1]);
        }
	}

	 private static void dfs(int n, int start, int to, int mid) {
	        if(n == 1){
	        	list.add(new int[]{start, to});
	            return;
	        }
	        
	        dfs(n-1, start, mid, to);
	        list.add(new int[]{start, to});
	        dfs(n-1, mid, to, start);
	 }
}
