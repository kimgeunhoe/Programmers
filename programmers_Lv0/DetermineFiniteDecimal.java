package programmers_Lv0;

public class DetermineFiniteDecimal {

	public static void main(String[] args) {
		int a = 7;
		int b = 20;

        for(int i=Math.min(a, b); i>1; i--) {
        	if(a%i==0 && b%i==0) {
        		b /= i;
        		break;
        	}
        }

        int num = 0;
        while(b!=0) {
        	num = a % b;
        	a = b;
        	b = num;
        }
        
        for(int i=2; b>1 && i<=5; i+=3) {
        	while(b%i==0) {
        		b /= i;
        	}
        }
        
        System.out.println(b==1 ? b : 2);
	}

}
