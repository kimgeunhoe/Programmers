package programmers_Lv0;

public class FindInteger {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int n = 3;
		int answer = 0;
        
        for(int nl : num_list) {
            if(nl==n) {
                answer++;
                break;
            }
        }
        
        System.out.println(answer);
	}

}
