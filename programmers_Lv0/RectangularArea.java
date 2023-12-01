package programmers_Lv0;

public class RectangularArea {

	public static void main(String[] args) {
		//int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int answer = 1;
        
        for(int i=1; i<=3; i++) {
        	for(int j=0; j<2; j++) {
        		if (dots[0][j]==dots[i][j]) {
        			j = j==0 ? 1 : 0;
        			answer *= dots[0][j] - dots[i][j];
        			break;
        		}
        	}
        }

        System.out.println(Math.abs(answer));
	}

}
