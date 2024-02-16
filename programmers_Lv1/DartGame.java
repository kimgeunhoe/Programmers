package programmers_Lv1;

public class DartGame {

	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		int answer = 0;
	    int score = 0;
	    int[] arr = new int[3];
	    int index = 0;
	    
	    for(int i=0; i<dartResult.length()-1; i+=2) {
	    	if(dartResult.charAt(i+1)=='0') {
	    		score = 10;
	    		i++;
	    	} else {
	    		score = Character.getNumericValue(dartResult.charAt(i));
	    	}

	    	if(dartResult.charAt(i+1)!='S') {
	    		score = (int)Math.pow(score, dartResult.charAt(i+1)=='D' ? 2 : 3);
	    	}
	    	
	    	if(i+2<dartResult.length() && !(dartResult.charAt(i+2)>='0' && dartResult.charAt(i+2)<='9')) {
	    		if(dartResult.charAt(i+2)=='*') {
	    			if(index!=0) {
	    				arr[index-1] *= 2; 
	    			}
	    	
	    			score *= 2;
	    		} else {
	    			score *= -1;
	    		}
	    		
	    		i++;
	    	}
	    	
	    	arr[index] = score;
	    	index++;
	    }
	    
	    for(int a : arr) {
	    	answer += a;
	    }

	    System.out.println(answer);
	}

}
