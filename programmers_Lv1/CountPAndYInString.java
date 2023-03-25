package programmers_Lv1;

public class CountPAndYInString {

	public static void main(String[] args) {
		String s = "Pyy";
//		String s = "pPoooyY";
        int answer = 0;

        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)=='p' || s.charAt(i)=='P') {
        		answer++;
        	} else if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
        		answer--;
        	}
        }
        
        System.out.println(answer==0);
	}

}
