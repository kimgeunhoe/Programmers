package programmers_Lv2;

public class AnAnalogClock {
//	https://school.programmers.co.kr/learn/courses/30/lessons/250135
	public static void main(String[] args) {
		int h1 = 0;
		int m1 = 5;
		int s1 = 30;
		int h2 = 0;
		int m2 = 7;
		int s2 = 0;
		int answer = 0;
        double start = h1 * 3600 + m1 * 60 + s1;
        double end = h2 * 3600 + m2 * 60 + s2;

        if (start == 0 || start == 12 * 3600) {
            answer += 1;
        }

        while (start < end) {
            // 각도를 기준으로 계산
            double h = start / 120 % 360;
            double m = start / 10 % 360;
            double s = start * 6 % 360;
            // 다음 각도 계산
            double nh = calc((start + 1) / 120 % 360);
            double nm = calc((start + 1) / 10 % 360);
            double ns = calc((start + 1) * 6 % 360);

            if (s < h && nh <= ns) { // 초침과 시침이 만나면
                answer += 1;
            }
            if (s < m && nm <= ns) { // 초침과 분침이 만나면
                answer += 1;
            }
            if (ns == nh && nh == nm) { // 초침, 시침, 분침이 모두 겹치면
                answer -= 1;
            }

            start += 1;
        }

		System.out.println(answer);
	}

	public static double calc(double x){
        if (x == 0){
            return 360;
        }
        return x;
    }

}
