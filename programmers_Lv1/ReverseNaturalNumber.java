package programmers_Lv1;

public class ReverseNaturalNumber {

	public static void main(String[] args) {
		long n = 12345;
		String num = String.valueOf(n);
		int[] answer = new int[num.length()];
		int index = num.length() - 1;
		
		for(int i=0; i<num.length(); i++) {
			answer[index--] = Character.getNumericValue(num.charAt(i));
		}
		
		for(int a : answer) {
	        System.out.println(a);
	    }
	}

}
