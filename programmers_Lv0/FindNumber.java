package programmers_Lv0;

public class FindNumber {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		int answer = Integer.toString(num).indexOf(String.valueOf(k));
        
        System.out.println(answer + (answer==-1 ? 0 : 1));
	}

}
