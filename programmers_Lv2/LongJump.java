package programmers_Lv2;

public class LongJump {

	public static void main(String[] args) {
		int n = 5;
		long answer = 5;
		long pre = 0;
		long num = 3;
		
		if(n<4) {
			System.out.println(n);
		} else {
			for(int i=4; i<n; i++) {
				pre = answer;
				answer = (answer + num) % 1234567;
				num = pre;
			}
		}

		System.out.println(answer);
	}

}
