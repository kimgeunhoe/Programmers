package programmers_Lv1;

public class Keypad {

	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		StringBuilder sb = new StringBuilder();
		int right = 12;
		int left = 10;
		int ldiff = 0;
		int rdiff = 0;
		int num = 0;
		
		for(int n : numbers) {
			if(n==0) {
				n = 11;
			}
			
			if(n%3==2) {
				ldiff = Math.abs((n - 1)%3 - (left - 1)%3) + Math.abs((n - 1)/3 - (left - 1)/3);
				rdiff = Math.abs((n - 1)%3 - (right - 1)%3) + Math.abs((n - 1)/3 - (right - 1)/3);
				
				if(ldiff==rdiff) {
					num = "right".equals(hand) ? 1 : -1;
				} else {
					num = rdiff<ldiff ? 1 : -1;
				}
			} else {
				num = n%3==0 ? 1 : -1;
			}
			
			if(num==1) {
				sb.append("R");
				right = n;
			} else {
				sb.append("L");
				left = n;
			}
		}
        
        System.out.println(sb.toString());
	}

}
