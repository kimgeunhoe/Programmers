package programmers_Lv0;

public class CountOddEven {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = {0, 0};

        for(int n : num_list) {
        	answer[n%2==0 ? 0 : 1] += 1;
//        	if(n!=0) {
//        	} //0도 짝수취급?
        }
        
        System.out.println(answer[0] + " " + answer[1]);
	}

}
