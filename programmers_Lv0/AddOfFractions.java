package programmers_Lv0;

public class AddOfFractions {

	public static void main(String[] args) {
		int denum1 = 1;
		int num1 = 2;
		int denum2 = 3;
		int num2 = 4;
		int[] answer = new int[2];
		int min = Math.min(num1, num2);
		
		for(int i=min; i>0; i--) {
	    	if(num1%i==0 && num2%i==0) {
	    		answer[1] = num1 * num2 / i;
	    		break;
	    	}
	    }
		
		answer[0] = denum1 * answer[1] / num1 + denum2 * answer[1] / num2;
		
		min = Math.min(answer[0], answer[1]);
		
		for(int i=min; i>0; i--) {
	    	if(answer[0]%i==0 && answer[1]%i==0) {
	    		answer[0] /= i;
	    		answer[1] /= i;
	    		break;
	    	}
	    }
		
		System.out.println(answer[0] + " " + answer[1]);
	}
}
