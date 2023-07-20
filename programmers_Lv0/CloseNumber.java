package programmers_Lv0;

public class CloseNumber {

	public static void main(String[] args) {
		int[] array = {3, 10, 28};
		int n = 20;
		int answer = array[0];
        int diff = Math.abs(array[0] - n);
        int abs = 0;
        
        for(int i=1; i<array.length; i++) {
            abs = Math.abs(array[i] - n);
            
        	if(diff==abs) {
        		answer = Math.min(answer, array[i]);
        	} else if(diff>abs) {
                diff = abs;
        		answer = array[i];
        	}
        }
        
        System.out.println(answer);
	}

}
