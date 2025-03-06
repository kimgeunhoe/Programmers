package programmers_Lv2;

public class ToConvertNumbers {
//	https://school.programmers.co.kr/learn/courses/30/lessons/154538
	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int n = 5;
		int[] arr = new int[y+1];
		
		for(int i=x; i<y+1; i++) {
			if (i!=x && arr[i]==0) {
	            arr[i] = -1;
	            continue;
	        }
			
			if(i * 2 <= y) {
	            arr[i * 2] = (arr[i * 2]==0) ? arr[i] + 1 : Math.min(arr[i] + 1, arr[i * 2]);
	        }
			
	        if(i * 3 <= y) {
	            arr[i * 3] = (arr[i * 3]==0) ? arr[i] + 1 : Math.min(arr[i] + 1, arr[i * 3]);
	        }
	        
	        if(i + n <= y) {
	            arr[i + n] = (arr[i + n]==0) ? arr[i] + 1 : Math.min(arr[i] + 1, arr[i + n]);
	        }
		}
		
		System.out.println(arr[y]);
	}

}
