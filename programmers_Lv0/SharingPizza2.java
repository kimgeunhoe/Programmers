package programmers_Lv0;

public class SharingPizza2 {

	public static void main(String[] args) {
		int n = 4;
	    int min = Math.min(n, 6);
	    int num = 0;
	    
		for(int i=min; i>=1; i--) {
			if(n%i==0 && 6%i==0) {
				num = i;
				break;
			}
		}
		
	    System.out.println(n/num);
	}

}
