package programmers_Lv1;

public class LottoRank {

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int o = 0;
		int sameNum = 0;
		
		for(int l : lottos) {
			if(l==0) {
				o++;
			} else {
				for(int w : win_nums) {
					if(l==w) {
						sameNum++;
						break;
					}
				}
			}
		}
		
		int high = 7 - o - sameNum;
		int low = 7 - sameNum;
		
		if(high==7) {
			high = 6;
		}

		if(low==7) {
			low = 6;
		}
		
		System.out.print(high + ", " + low);
	}

}
