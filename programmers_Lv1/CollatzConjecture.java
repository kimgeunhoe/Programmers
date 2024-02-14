package programmers_Lv1;

public class CollatzConjecture {

	public static void main(String[] args) {
		long num = 1;
        int answer = 0;
        
        for(; answer<500 && num!=1; answer++) {
        	num = num%2==0 ? num/2 : num*3+1;
        }
        
        System.out.println(num==1 ? answer : -1);
	}

}
