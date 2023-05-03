package programmers_Lv1;

public class Keypad {

	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		String answer = "";

		int left = 10;
		int right = 12;
		int ldiff = 0;
		int rdiff = 0;

		for(int num : numbers) {
        	switch (num) {
			case 1:
			case 4:
			case 7:
				answer += "L";
				left = num;
				break;
			case 3:
			case 6:
			case 9:
				answer += "R";
				right = num;
				break;
			case 2:
			case 5:
			case 8:
			case 0:
				if(num==0) {
					num = 11;
				}
				ldiff = Math.abs(num-left)/3 + Math.abs(num-left)%3;
				rdiff = Math.abs(num-right)/3 + Math.abs(num-right)%3;
				if(ldiff<rdiff) {
					answer += "L";
					left = num;
				} else if(ldiff>rdiff) {
					answer += "R";
					right = num;
				} else {
					if(hand.equals("left")) {
						answer += "L";
						left = num;
					} else {
						answer += "R";
						right = num;
					}
				}
			default:
				break;
			}
        }
        System.out.println(answer);
	}

}
