package programmers_Lv0;

public class Parallel {

	public static void main(String[] args) {
		int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int answer = 0;
        int[] arr = new int[2];

        for(int i=1; i<=3; i++) {
        	if(i!=1) {
        		arr = dots[1];
        		dots[1] = dots[i];
        		dots[i] = arr;
        	}

        	if((dots[0][1]-dots[1][1])*(dots[2][0]-dots[3][0])==(dots[2][1]-dots[3][1])*(dots[0][0]-dots[1][0])) {
        		answer = 1;
        		break;
        	}
        }

        System.out.println(answer);
	}

}
