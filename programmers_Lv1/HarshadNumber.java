package programmers_Lv1;

public class HarshadNumber {

	public static void main(String[] args) {
		int x = 10;
		int num = x;
        int sum = 0;
        
        for(; num>0; num/=10) {
            sum += num%10;
        }
		
		System.out.println(x%sum==0);
	}

}
