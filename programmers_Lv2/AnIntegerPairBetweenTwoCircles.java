package programmers_Lv2;

public class AnIntegerPairBetweenTwoCircles {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181187
	public static void main(String[] args) {
		int r1 = 2;
		int r2 = 3;
		long answer = 0;
		
		for(double i=1; i<=r2; i++) {
			double max = Math.floor(Math.sqrt(Math.pow(r2, 2) - Math.pow(i, 2)));
			double min = Math.ceil(Math.sqrt(Math.pow(r1, 2) - Math.pow(i, 2)));

			if(!Double.isNaN(min)) {
				answer -= min;
			}
			
			answer += max + 1;
		}
		
		System.out.println(answer * 4);
	}

}
