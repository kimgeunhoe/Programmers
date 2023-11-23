package programmers_Lv0;

public class QrCode {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181903
	public static void main(String[] args) {
		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		StringBuilder sb = new StringBuilder();
		        
		for(int i=r; i<code.length(); sb.append(code.charAt(i)), i+=q);

		System.out.println(sb.toString());
	}

}
