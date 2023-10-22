package programmers_Lv0;

public class Mumbling1 {

	public static void main(String[] args) {
//		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
	    int answer = 0;
	    String[] Mumbling = {"aya", "ye", "woo", "ma"};

	    for(String b : babbling) {
	    	for(String m : Mumbling) {
	    		b = b.replace(m, " ");
	    		
	    		if(b.trim().length()==0) {
	    			answer++;
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
