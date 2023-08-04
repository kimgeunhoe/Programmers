package programmers_Lv0;

public class CountHowManyTimesAStringAppears {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		int answer = 0;
		        
		for(int i=0; i<myString.length()-pat.length()+1; i++) {
			if(pat.equals(myString.substring(i, i + pat.length()))) {
				answer++;
			}
		}
		        
		System.out.println(answer);
	}

}
