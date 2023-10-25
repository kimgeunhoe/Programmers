package programmers_Lv0;

public class NextNumberToCome {

	public static void main(String[] args) {
		int[] common = {1, 2, 3, 4};
		int answer = common[0]+common[2]==common[1]*2 ? 0 : 1;
	    int r = answer==0 ? common[1] - common[0] : common[1] / common[0];

        System.out.println(answer==0 ? common[common.length-1] + r : common[common.length-1] * r);
	}

}
