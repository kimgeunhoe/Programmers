package programmers_Lv0;

public class HateEnglish {

	public static void main(String[] args) {
		String numbers = "onetwothreefourfivesixseveneightnine";
		String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<num.length; i++) {
        	numbers = numbers.replace(num[i], Integer.toString(i));
        }

        System.out.println(Long.parseLong(numbers));
	}

}
