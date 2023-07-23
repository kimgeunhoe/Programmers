package programmers_Lv0;

public class CompareArrays {

	public static void main(String[] args) {
		int[] arr1 = {49, 13};
		int[] arr2 = {70, 11, 2};
		int answer = 0;

		if(arr1.length!=arr2.length) {
			answer = arr1.length - arr2.length;
		} else {
			for(int i=0; i<arr1.length; i++) {
				answer += arr1[i] - arr2[i];
			}
		}
		
		System.out.println(answer==0 ? 0 : answer>0 ? 1 : -1);
	}

}
