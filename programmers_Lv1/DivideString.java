package programmers_Lv1;

public class DivideString {

	public static void main(String[] args) {
		String s = "banana";
		int answer = 0;
		char x = 0;
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(count==0) {
				answer++;
				x = s.charAt(i);
			}
			
			count += s.charAt(i)==x ? 1 : -1;
		}
		
		System.out.println(answer);
	}

}
