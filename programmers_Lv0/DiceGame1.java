package programmers_Lv0;

public class DiceGame1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
        int check = 0;
        
        if(a%2==1) {
            check++;
        }
        
        if(b%2==1) {
            check++;
        }

        System.out.println(check==0 ? Math.abs(a-b) : check==1 ? (a + b) * 2 : a * a + b * b);
	}

}
