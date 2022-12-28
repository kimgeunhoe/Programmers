package programmers_Lv0;

public class IceAmericano {

	public static void main(String[] args) {
		int money = 5500;
		
		for(int a : new int[] {money/5500, money%5500}) {
			System.out.println(a);
		}
	}

}
