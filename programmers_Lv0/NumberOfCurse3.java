package programmers_Lv0;

public class NumberOfCurse3 {

	public static void main(String[] args) {
		int n = 40;
	
        for(int i=3; i<=n; i++) {
        	if(i%3==0 || String.valueOf(i).contains("3")) {
        		n++;
        	}
        }
        
        System.out.println(n);
	}

}
