package programmers_Lv0;

public class CalculatingString {

	public static void main(String[] args) {
		String my_string = "3 + 4";
		int answer = 0;
		String[] str = my_string.replace("- ", "-").replace("+ ", "").split(" ");
		
		for(int i=0; i<str.length; i++) {
			answer += Integer.parseInt(str[i]);
		}
		
        System.out.println(answer);
	}

}
