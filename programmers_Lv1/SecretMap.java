package programmers_Lv1;

public class SecretMap {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
		String str = "";
		
		for(int i=0; i<n; i++) {
			answer[i] = "";
			str = Integer.toBinaryString(arr1[i] | arr2[i]);
			
			while(str.length()<n) {
				str = "0" + str;
			}
			
			for(int j=0; j<n; j++) {
				answer[i] += str.charAt(j)=='0' ? " " : "#";
			}
		}
		
		for(String a : answer) {
			System.out.println(a);
		}
	}

}
