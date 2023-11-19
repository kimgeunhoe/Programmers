package programmers_Lv0;

public class ProcessingCode {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181932
	public static void main(String[] args) {
		String code = "abc1abc1abc";
		boolean mode = true;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<code.length(); i++) {
			if(code.charAt(i)=='1') {
				mode = !mode;
			} else if(i%2==(mode ? 0 : 1)) {
				sb.append(code.charAt(i));
			}
		}

		System.out.println(sb.length()!=0 ? sb.toString() : "EMPTY");
	}

}
