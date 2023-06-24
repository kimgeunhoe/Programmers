package programmers_Lv0;

public class AdditionOfHiddenNumbers1 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        char c = '0';
        
        for(int i=0; i<my_string.length(); i++) {
        	c = my_string.charAt(i);
        	
        	if(c>='1' && c<='9') {
        		answer += Character.getNumericValue(c);
        	}
        }
        
        System.out.println(answer);
	}

}
