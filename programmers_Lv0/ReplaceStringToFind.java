package programmers_Lv0;

public class ReplaceStringToFind {

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		char[] arr = pat.toCharArray();
		        
		for(int i=0; i<arr.length; i++) {
			arr[i] += arr[i]=='A' ? 1 : -1;
		}
		
		System.out.println(myString.contains(String.valueOf(arr)) ? 1 : 0);
	}

}
