package programmers_Lv0;

public class SimilarityOfArrangement {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = 0;
        
        for(String a : s1) {
        	for(String b : s2) {
        		if(a.equals(b)) {
        			answer++;
        			break;
        		}
        	}
        }
        
        System.out.println(answer);
	}

}
