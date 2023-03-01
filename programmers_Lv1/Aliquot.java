package programmers_Lv1;

public class Aliquot {

	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int answer = 0;
		int count = 0;
		
		for(int i=left; i<=right; i++) {
//		//제곱수인 경우 약수의 개수가 홀수
//        if (i % Math.sqrt(i) == 0) {
//            answer -= i;
//        }
//        //제곱수가 아닌 경우 약수의 개수가 짝수
//        else {
//            answer += i;
//        }
			count = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			answer += count%2==0 ? i : -i;
		}
		
		
		System.out.println(answer);
	}

}
