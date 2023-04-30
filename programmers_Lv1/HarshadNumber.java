package programmers_Lv1;

public class HarshadNumber {

	public static void main(String[] args) {
		int x = 10;
		int num = x;
		int sum = 0;
		
		do {
			sum += num%10;
			num = (int) Math.ceil(num/10);
		} while(num>=1);
		
		System.out.println(x%sum==0);
	}

}
