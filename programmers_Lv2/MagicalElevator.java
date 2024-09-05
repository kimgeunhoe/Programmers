package programmers_Lv2;

public class MagicalElevator {
//	https://school.programmers.co.kr/learn/courses/30/lessons/148653
	public static void main(String[] args) {
//		int storey = 16;
//		int storey = 2554;
//		int storey = 54;
//		int storey = 56;
//		int storey = 5555;
//		int storey = 57595358;
//		int storey = 5;
//		int storey = 75;
//		int storey = 555;
		int storey = 545;
		int answer = 0;
		
		while(storey>0) {
			int remainder = storey % 10;

			if(remainder==5) {
				if(storey%100>50) {
					storey += 10;
				}
				
				answer += 5;
			} else if(remainder>5) {
				answer += 10 - remainder;
				storey += 10;
			} else {
				answer += remainder;
			}

			storey /= 10;
		}
		
		System.out.println(answer);
	}

}
