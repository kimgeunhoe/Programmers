package programmers_Lv0;

public class CtrlZ {

	public static void main(String[] args) {
		String s = "10 Z 20 Z 1";
	    int answer = 0;
        String[] arr = s.split(" ");
	    
	    for(int i=0; i<arr.length; i++) {
	    	if(i<arr.length-1 && "Z".equals(arr[i+1])) {
	    		i++;
	    	} else {
	    		answer += Integer.parseInt(arr[i]);
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
