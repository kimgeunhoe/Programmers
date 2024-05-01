package programmers_Lv2;

import java.util.Stack;

public class KakaoFriendsColoringBook {
	public static void main(String[] args) {
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int m = 6;
		int n = 4;
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		int num = 0;
		int a = 0;
		int b = 0;
		int count = 0;
		int[][] move = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		Stack<Index> stack = new Stack<>();
		
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(picture[i][j]!=0) {
        			num = picture[i][j];
        			picture[i][j] = 0;
        			count = 1;
        			stack.add(new Index(i, j));
        			
        			while(!stack.empty()) {
        				Index ind = stack.pop();
        				
        				for(int k=0; k<4; k++) {
        					a = ind.x + move[k][0];
        					b = ind.y + move[k][1];
        					
        					if(a>=0 && a<m && b>=0 && b<n && picture[a][b]==num) {
        						picture[a][b] = 0;
        						count++;
        						stack.add(new Index(a, b));
        					}
        				}
        			}
        			
        			numberOfArea++;
        			maxSizeOfOneArea = maxSizeOfOneArea>count ? maxSizeOfOneArea : count;
        		}
        	}
        }

        for(int an : new int[] {numberOfArea, maxSizeOfOneArea}) {
        	System.out.println(an);
        }
	}
	
	static class Index {
		int x;
		int y;
		
		public Index(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
