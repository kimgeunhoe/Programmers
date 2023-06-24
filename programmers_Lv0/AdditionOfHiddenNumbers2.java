package programmers_Lv0;

public class AdditionOfHiddenNumbers2 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        int num = 0;
        char c = '0';
        
        for(int i=0; i<my_string.length(); i++) {
        	c = my_string.charAt(i);
        	
        	if(c>='0' && c<='9') {
        		num *= 10;
        		num += Character.getNumericValue(c);
        	} else {
        		answer += num;
    			num = 0;
        	}
        }
        
        System.out.println(answer + num);
 
//        String[] arr = my_string.replaceAll("[^0-9]", " ").split(" ");
//        
//        for(String a : arr) {
//        	if(!a.equals("")) {
//        		answer += Integer.parseInt(a);
//        	}
//        }
//        
//        System.out.println(answer);
	}

}
