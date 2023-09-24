package programmers_Lv0;

public class Game369 {

	public static void main(String[] args) {
		int order = 29423;
	    
//	    System.out.println(String.valueOf(order).replaceAll("[^369]", "").length());

		int answer = 0;
	    String str = String.valueOf(order);
	    char num = ' ';
	    
	    for(int i=0; i<str.length(); i++) {
	    	num = str.charAt(i);
	    	
	    	for(char c='3'; c<='9'; c+=3) {
	    		if(num==c) {
	    			answer++;
	    			break;
	    		}
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
