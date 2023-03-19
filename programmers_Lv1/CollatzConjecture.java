package programmers_Lv1;

public class CollatzConjecture {

	public static void main(String[] args) {
		long num = 626331;
	    int answer = 0;

	    while(num!=1) {
	    	num = num%2==0 ? num/2 : num * 3 + 1;
	    	answer++;
	    }
	    
	    System.out.println(answer<500 ? answer : -1);
	}

}
