package programmers_Lv1;

public class MakeHamburger {

	public static void main(String[] args) {
		int[] ingredient = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
//		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		int answer = 0;
	    StringBuilder sb = new StringBuilder();
        int length = 0;
	    
	    for(int i : ingredient) {
	    	sb.append(i);
	    	length = sb.length();
            
	    	if(length>3 && sb.subSequence(length-4, length).equals("1231")) {
	    		sb.setLength(length-4);
	    		answer++;
	    	}
	    }
	    
        System.out.println(answer);
	}

}
