package programmers_Lv1;

public class Overpainting {

	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};
		int answer = 0;
        int point = 0;
        
        for(int s : section) {
        	if(point<s) {
        		point = s + m - 1;
        		answer++;
        	}
        }
        
        System.out.println(answer);
	}

}
