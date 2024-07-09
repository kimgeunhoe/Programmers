package programmers_Lv2;

public class DeliveryAndCollection {
//	https://school.programmers.co.kr/learn/courses/30/lessons/150369?language=java
	public static void main(String[] args) {
		int cap = 4;
		int n = 5;
		int[] deliveries = {1, 0, 3, 1, 2};
		int[] pickups = {0, 3, 0, 4, 0};
		long answer = 0;
		int delivery = 0;
		int pickup = 0;
		
        for(int i=n; i>0; i--) {
            delivery -= deliveries[i-1];
            pickup -= pickups[i-1];
            
            while(delivery<0 || pickup<0){
            	delivery += cap;
                pickup += cap;
                answer += i * 2;
            }
        }
        
        System.out.println(answer);
	}

}
