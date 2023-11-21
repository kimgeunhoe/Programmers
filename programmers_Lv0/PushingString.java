package programmers_Lv0;

public class PushingString {

	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
        int answer = 0;
        int length = A.length();
        
	    if(!A.equals(B)) {
	    	StringBuilder sb = new StringBuilder();
	    	
	    	for(int i=1; i<length; i++) {
	    		sb.append(A.substring(length-i)).append(A.substring(0, length-i));
	    		
	    		if(sb.toString().equals(B)) {
	    			answer = i;
	    			break;
	    		}
                
                sb.setLength(0);
	    	}
	    	
	    	if(answer==0) {
	    		answer--;
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
