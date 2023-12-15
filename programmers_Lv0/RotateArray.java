package programmers_Lv0;

public class RotateArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		String direction = "right";
		int length = numbers.length;
	    int[] answer = new int[length--];
	    
	    if(direction.equals("right")) {
	    	answer[0] = numbers[length];
	    	
	    	for(int i=0; i<length; i++) {
	    		answer[i+1] = numbers[i];
	    	}
	    } else {
	    	answer[length] = numbers[0];
	    	
	    	for(int i=0; i<length; i++) {
	    		answer[i] = numbers[i+1];
	    	}
	    }
	    
	    for(int a : answer) {
	    	System.out.println(a);
	    }
	}

}
