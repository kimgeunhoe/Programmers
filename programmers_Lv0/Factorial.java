package programmers_Lv0;

public class Factorial {

	public static void main(String[] args) {
		int n = 1;
        int answer = 1;
        int i = 1;
        
        for(; i<=n; answer++) {
        	i *= answer;
        }
        
        System.out.println(answer - (i==n ? 1 : 2));
	}

}
