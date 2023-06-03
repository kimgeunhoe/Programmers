package programmers_Lv1;

public class SBSBSBSBSBSBSBS {

	public static void main(String[] args) {
		int n = 4;
	    StringBuilder answer = new StringBuilder();

	    for(int i=0; i<n; i++) {
	    	answer.append(i%2==0 ? "수" : "박");
	    }
	    
	    System.out.println(answer.toString());
	}

}
