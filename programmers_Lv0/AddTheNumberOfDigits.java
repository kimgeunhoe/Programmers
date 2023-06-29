package programmers_Lv0;

public class AddTheNumberOfDigits {

	public static void main(String[] args) {
		int n = 1234;
		int answer = 0;
        
        for(; n!=0; n/=10) {
        	answer += n%10;
        }
        
        System.out.println(answer);
	}

}
