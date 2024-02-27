package programmers_Lv1;

public class HidePhoneNumber {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i<phone_number.length()-4; i++) {
	    	sb.append('*');
	    }
	    
	    sb.append(phone_number.substring(phone_number.length()-4));
	    
	    System.out.println(sb.toString());
		
	    System.out.println(phone_number.replaceAll(".(?=.{4})", "*"));
	    //https://shrimp-burger.tistory.com/149
	}

}
