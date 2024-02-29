package programmers_Lv1;

public class KnightsWeapon {

	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
		int answer = 1;
        int[] num = new int[number+1];    
        
        for(int i=1; i<=number; i++) {
            for(int j=1; j<=number/i; j++) {
                num[i*j]++;
            }
        }
        
        for (int i=2; i<=number; i++) {
            answer += num[i]<=limit ? num[i] : power;
        }
        
		System.out.println(answer);
	}

}
