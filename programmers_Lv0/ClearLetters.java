package programmers_Lv0;

public class ClearLetters {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181900
	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		char[] arr = my_string.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<indices.length; i++) {
			arr[indices[i]] = ' ';
		}
		
		for(char a : arr) {
			if(a!=' ') {
				sb.append(a);
			}
		}

		System.out.println(sb.toString());
	}

}
