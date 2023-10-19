package programmers_Lv0;

public class Morse1 {

	public static void main(String[] args) {
		String letter = ".--. -.-- - .... --- -.";
		StringBuilder sb = new StringBuilder();
	    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	    String[] str = letter.split(" ");
	    
	    for(int i=0; i<str.length; i++) {
	    	for(int j=0; j<26; j++) {
	    		if(morse[j].equals(str[i])) {
	    			sb.append((char)(97 + j));
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(sb.toString());
	}

}
