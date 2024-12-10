package programmers_Lv2;

public class PseudocantoreBitColumn {
//	https://school.programmers.co.kr/learn/courses/30/lessons/148652
	public static void main(String[] args) {
		int n = 2;
		long l = 4;
		long r = 17;
		int answer = 0;

		 for (l--; l < r; l++) {
			 System.out.println(l);
			 if (check(l)) answer++;
	     }
		 
		 System.out.println(answer);
	}

	static boolean check(long l) {
        if (l < 5 && l != 2) return true;
        if ((l - 2) % 5 == 0) return false;

        return check(l / 5);
    }
}
