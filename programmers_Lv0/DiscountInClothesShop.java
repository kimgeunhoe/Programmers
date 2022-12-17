package programmers_Lv0;

public class DiscountInClothesShop {

	public static void main(String[] args) {
		int price = 150000;

        if(price>=500000) {
        	System.out.println(price*8/10);
        } else if(price>=300000) {
        	System.out.println(price*9/10);
        } else if(price>=100000) {
        	System.out.println(price*95/100);
        } else {
        	System.out.println(price);
        }
	}

}
