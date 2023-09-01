package programmers_Lv0;

public class DiceGame2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181930
	public static void main(String[] args) {
		int a = 2;
		int b = 6;
		int c = 1;
		int answer = 1;
		int count = 1;
		int[] dice = {a, b, c};
		int num = 0;
		
		for(int i=0; i<3; i++) {
			if(dice[i]==dice[(i+1)%3] && count<3) {
				count++;
			}
		}
		
		for(int i=1; i<=count; i++) {
			for(int d : dice) {
				num += Math.pow(d, i);
			}
			
			answer *= num;
			num = 0;
		}

		System.out.println(answer);
	}

}
