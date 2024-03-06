package programmers_Lv1;

public class Mumbling2 {

	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa"};
        String[] Mumbling = {"aya", "ye", "woo", "ma"};
	    int answer = 0;
		    
	    for(String b : babbling) {
	    	for(String m : Mumbling) {
//	    		if(!b.contains(m.repeat(2))) {
	    		if(!b.contains(m+m)) {
	    			b = b.replace(m, " ");
	    		} else {
	    			break;
	    		}
	    	}

	    	if(b.trim().length()==0) {
	    		answer++;
	    	}
	    }

	    System.out.println(answer);
	}

}
