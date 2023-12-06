package programmers_Lv0;

public class ReplaceIndex {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		char[] ch = my_string.toCharArray();

        ch[num1] = my_string.charAt(num2);
        ch[num2] = my_string.charAt(num1);

        System.out.println(String.valueOf(ch));
	}

}
