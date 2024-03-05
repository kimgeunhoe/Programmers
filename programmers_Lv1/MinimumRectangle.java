package programmers_Lv1;

public class MinimumRectangle {

	public static void main(String[] args) {
//		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
	    int x = 0;
	    int y = 0;
	    
	    for(int[] s : sizes) {
	    	x = Math.max(x, Math.max(s[0], s[1]));
	    	y = Math.max(y, Math.min(s[0], s[1]));
	    }
	    
	    System.out.println(x * y);
	}

}
