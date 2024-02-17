package programmers_Lv1;

import java.util.Arrays;

public class DesktopCleanup {

	public static void main(String[] args) {
		String[] wallpaper = {".#...", "..#..", "...#."};
		int[] answer = new int[4];
		int num = 0;
		
		answer[0] = wallpaper.length;
		answer[1] = wallpaper[0].length();
		
		for(int i=0; i<wallpaper.length; i++) {
			for(int j=0; j<wallpaper[i].length(); j++) {
				if(wallpaper[i].charAt(j)=='#') {
					for(int k=0; k<2; k++) {
						num = k==0 ? i : j;
						answer[k] = Math.min(answer[k], num);
						answer[k+2] = Math.max(answer[k+2], num+1);
					}
				}
			}
		}
				
		System.out.println(Arrays.toString(answer));
	}

}
