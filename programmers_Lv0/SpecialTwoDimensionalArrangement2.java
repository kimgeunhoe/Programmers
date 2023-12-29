package programmers_Lv0;

public class SpecialTwoDimensionalArrangement2 {

	public static void main(String[] args) {
		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
		int answer = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i][j]!=arr[j][i]) {
					answer = 0;
					break;
				}
			}
		}
		
		System.out.println(answer);
	}

}
