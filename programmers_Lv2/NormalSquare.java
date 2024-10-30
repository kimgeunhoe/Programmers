package programmers_Lv2;

public class NormalSquare {
//	https://school.programmers.co.kr/learn/courses/30/lessons/62048
	public static void main(String[] args) {
//		int w = 8;
//		int h = 12;
		int w = 100000000;
		int h = 999999999;
		long answer = (long) w * h;
		int max = Math.max(w, h);
		int min = Math.min(w, h);
		int gcd = 1;
        long ww = 0;
        long hh = 0;
		
		for(int i=2; i<=min; i++) {
			if(max%i==0 && min%i==0) {
				gcd = i;
			}
		}
		
		hh = max / gcd;
		ww = min / gcd;
		
		System.out.println(answer - (hh * ww - (ww - 1) * (hh - 1)) * gcd);
	}

}
