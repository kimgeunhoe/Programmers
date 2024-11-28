package programmers_Lv2;

public class PointingAMole {
//	https://school.programmers.co.kr/learn/courses/30/lessons/140107
	public static void main(String[] args) {
		int k = 2;
		int d = 4;
		long answer = 0;
		long powD = (long)d * d;
		
		for(int i=0; i<=d; i+=k) {
			long powI = (long)i * i;
			double rest = powD - powI;
			long sqrt = (long)Math.sqrt(rest);

			answer += sqrt/k + 1;
		}
		
		System.out.println(answer);
	}

}
