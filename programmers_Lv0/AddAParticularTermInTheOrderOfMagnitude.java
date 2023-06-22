package programmers_Lv0;

public class AddAParticularTermInTheOrderOfMagnitude {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181931
	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		int answer = 0;
		        
		for(int i=0; i<included.length; i++) {
			if(included[i]) {
				answer += a + d * i;
			}
		}

		System.out.println(answer);
	}

}
