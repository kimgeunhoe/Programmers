package programmers_Lv0;

public class Decryption {

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
        StringBuilder answer = new StringBuilder();

        for(int i=code-1; i<cipher.length(); i+=code) {
        	answer.append(cipher.charAt(i));
        }

        System.out.println(answer.toString());
	}

}
