package programmers_Lv2;

import java.util.Arrays;

public class ListOfPhoneNumbers {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42577
	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"819232312", "976", "119552", "2"};
	    boolean answer = true;
	    
	    Arrays.sort(phone_book);
	    
	    for(int i=0; i<phone_book.length-1; i++) {
	    	if(phone_book[i+1].startsWith(phone_book[i])) {
	    		answer = false;
	    		break;
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
