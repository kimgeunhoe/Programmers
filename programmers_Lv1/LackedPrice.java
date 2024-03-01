package programmers_Lv1;

public class LackedPrice {

	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		
		System.out.println(Math.max(price * (long)(count * (count + 1) / 2) - money, 0));
	}

}
