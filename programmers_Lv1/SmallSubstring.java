package programmers_Lv1;

public class SmallSubstring {

	public static void main(String[] args) {
		String t = "3141592";
		String p = "271";
		int answer = 0;
		int length = p.length();
		
		for(int i=0; i<=t.length()-length; i++) {
			if(p.compareTo(t.substring(i, i+length))>=0) {
				answer++;
			}
		}
				
		System.out.println(answer);
	}

}
