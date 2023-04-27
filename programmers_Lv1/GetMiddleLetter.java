package programmers_Lv1;

public class GetMiddleLetter {

	public static void main(String[] args) {
		String s = "abcde";
//		int l = s.length()/2;
//	    System.out.println(l%2==0 ? new StringBuilder().append(s.charAt(l-1)).append(s.charAt(l)).toString() : Character.toString(s.charAt(l)));
	    System.out.println(s.substring((s.length()-1) / 2, s.length()/2 + 1));
	}

}
