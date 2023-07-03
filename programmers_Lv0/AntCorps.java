package programmers_Lv0;

public class AntCorps {

	public static void main(String[] args) {
		int hp = 999;
		int answer = 0;
        
        for(int attack=5; attack>0 && hp>0; attack -= 2) {
        	answer += hp / attack;
        	hp %= attack;
        }
        
        System.out.println(answer);
	}

}
