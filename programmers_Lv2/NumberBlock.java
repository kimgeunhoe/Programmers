package programmers_Lv2;

public class NumberBlock {

	public static void main(String[] args) {
		long begin = 1;
		long end = 10;
        int[] answer = new int[(int) (end - begin + 1)];
        long loc = 0;
        
        for(int i=begin==1?1:0; i<end-begin+1; i++) {
        	loc = begin + i;

        	if(loc%2==0 && loc<=20000000) {
        		answer[i] = (int) (loc / 2);
        	} else {
        		for(int j=3; j<=Math.sqrt(loc); j++) {
        			if(loc%j==0 && loc/j<=10000000) {
        				answer[i] = (int) (loc/j);
        				break;
        			}
        		}
        	}
 
        	if(answer[i]==0) {
        		answer[i] = 1;
        	}
        }
        
        for(int a : answer) {
        	System.out.println(a);
        }
	}

}
