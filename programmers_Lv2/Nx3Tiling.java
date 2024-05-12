package programmers_Lv2;

public class Nx3Tiling {

	public static void main(String[] args) {
		int n = 382;
		int length = n/2;
		long sum = 8;
		
		if(length*2!=n) {
			System.out.println(0);
		} else {
			long[] num = new long[length];
			num[0] = 3;
			
			if(length>1) {
				num[1] = 11;
			}
			
			for(int i=2; i<length; i++) {
				sum += 2 * num[i -1];
				num[i] = (sum + num[i - 1]) % 1000000007;
				
//				num[i] = num[i - 1] * 4 - num[i - 2];
			}
			
			System.out.println(num[length - 1]);
		}
	}
}
