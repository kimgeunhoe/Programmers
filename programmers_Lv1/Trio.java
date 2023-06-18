package programmers_Lv1;

public class Trio {

	public static void main(String[] args) {
		int[] number = {-2, 3, 0, 2, -5};
        int answer = 0;

        for(int i=0; i<number.length-2; i++) {
        	for(int j=i+1; j<number.length-1; j++) {
        		for(int k=j+1; k<number.length; k++) {
        			answer += number[i]+number[j]+number[k]==0 ? 1 : 0;
        		}
        	}
        }
        
        System.out.println(answer);
	}

}
