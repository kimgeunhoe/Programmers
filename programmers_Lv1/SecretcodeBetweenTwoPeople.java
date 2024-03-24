package programmers_Lv1;

public class SecretcodeBetweenTwoPeople {

	public static void main(String[] args) {
		String s = "aukks";
		String skip = "wbqd";
		int index = 5;
		StringBuilder sb = new StringBuilder();
        char sChar = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++) {
        	sChar = s.charAt(i);
        	
        	for(int j=0; j<index+count; j++) {
        		sChar += sChar<'z' ? 1 : -25;
        		
        		if(skip.contains(String.valueOf(sChar))) {
        			count++;
        		}
        	}
        	
        	sb.append(sChar);
        	count = 0;
        }
        
        System.out.println(sb.toString());
	}

}
