package programmers_Lv2;

public class AnticipatedListOfMatches {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12985
	public static void main(String[] args) {
//		int n = 16;
//		int a = 1;
//		int b = 16;
		int n = 8;
		int a = 4;
		int b = 7;
        int answer = 1;

        while((a-1)/2!=(b-1)/2) {
        	a = a/2 + a%2;
        	b = b/2 + b%2;
        	answer++;
        }
        
        System.out.println(answer);

        System.out.println(Integer.toBinaryString((a-1)^(b-1)).length());
	}

}
