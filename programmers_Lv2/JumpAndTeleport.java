package programmers_Lv2;

public class JumpAndTeleport {

	public static void main(String[] args) {
		int n = 5000;
        int ans = 0;

        while(n>1) {
        	ans += n%2;
        	n = n/2;
        }
        
        System.out.println(ans + n);
	}

}
