package programmers_Lv0;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int n = 10;
		
		n = n%2==0 ? n : n - 1;
		
		System.out.println((2 + n) * n / 4);
	}

}
