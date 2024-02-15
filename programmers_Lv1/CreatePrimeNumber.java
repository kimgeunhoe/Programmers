package programmers_Lv1;

public class CreatePrimeNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		int answer = 0;
		int pn = 0;
		//int bool = 0;
		
		for(int i=0; i<nums.length-2; i++) {
			for(int j=i+1; j<nums.length-1; j++) {
				l : for(int k=j+1; k<nums.length; k++) {
					//bool = 1;
					pn = nums[i]+nums[j]+nums[k];
					
					for(int l=2; l<=(int)Math.sqrt(pn); l++) {
						if(pn%l==0) {
							//bool = 0;
							//break;
							continue l;
						}
					}
					
//					answer += bool;
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}


