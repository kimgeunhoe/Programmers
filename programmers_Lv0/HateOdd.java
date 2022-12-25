package programmers_Lv0;

public class HateOdd {

	public static void main(String[] args) {
		int n = 11;
        int[] answer = {};
        int num = 1;
        int lenth = 0;
        
        if(n==1) {
        	answer = new int[] {1};
        } else {
        	lenth = n%2==0 ? n/2 : n/2 + 1;
        	answer = new int[lenth];
        	
        	for(int i=0; i<lenth; i++) {
        		answer[i] = num;
        		num += 2;
        	}
        }

        for(int a : answer) {
        	System.out.println(a);
        }
	}

}
