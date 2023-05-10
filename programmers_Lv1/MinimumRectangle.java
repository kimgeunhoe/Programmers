package programmers_Lv1;

public class MinimumRectangle {

	public static void main(String[] args) {
//		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		int l1 = 0;
		int l2 = 0;
		
		for(int[] size : sizes) {
			l1 = Math.max(l1, Math.max(size[0], size[1]));
			l2 = Math.max(l2, Math.min(size[0], size[1]));
		}
		
		System.out.println(l1*l2);
	}

}
