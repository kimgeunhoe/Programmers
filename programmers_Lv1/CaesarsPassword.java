package programmers_Lv1;

public class CaesarsPassword {

	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
	    StringBuilder answer = new StringBuilder();

	    for(int i=0; i<s.length(); i++) {
	    	if(s.charAt(i)==' ') {
	    		answer.append(" ");
	    	} else if((s.charAt(i)<='Z' && s.charAt(i)+n>'Z') || (s.charAt(i)>='a' && s.charAt(i)+n>'z')) {
	    		answer.append((char)(s.charAt(i)+n-26));
	    	} else {
	    		answer.append((char)(s.charAt(i)+n));
	    	}
	    }
	    
	    System.out.println(answer.toString());
	}

}
