package programmers_Lv0;

public class PrintRepeatString {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<my_string.length(); i++) {
        	for(int j=0; j<n; j++) {
        		sb.append(my_string.charAt(i));
        	}
        }
        
        System.out.println(sb.toString());
	}

}
