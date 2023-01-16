package programmers_Lv0;

public class PersonTallerThanMs {

	public static void main(String[] args) {
		int[] array = {149, 180, 192, 170};
		int height = 167;
        int answer = 0;

        for(int a : array ) {
        	if(a>height) {
        		answer++;        		
        	}
        }
        
        System.out.println(answer);
	}

}
