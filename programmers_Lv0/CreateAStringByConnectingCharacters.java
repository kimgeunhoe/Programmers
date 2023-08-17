package programmers_Lv0;

public class CreateAStringByConnectingCharacters {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181915
	public static void main(String[] args) {
		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		StringBuilder sb = new StringBuilder();
		        
		for(int i : index_list) {
			sb.append(my_string.charAt(i));
		}

		System.out.println(sb.toString());
	}

}
