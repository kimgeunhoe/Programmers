package programmers_Lv0;

public class NumberOfDice {

	public static void main(String[] args) {
		int[] box = {10, 8, 6};
		int n = 3;
        int answer = 1;

        for(int i=0; i<box.length; i++) {
        	answer *= box[i]/n;
        }
	        
        System.out.println(answer);
	}

}
