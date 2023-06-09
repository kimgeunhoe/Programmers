package programmers_Lv1;

public class StringToNumber {
	
	public static void main(String[] args) {
		String s = "one4seveneight";
		
		String[] str = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for(int i=0; i<str.length; i++) {
			s = s.replace(str[i], Integer.toString(i));
		}
		
		System.out.println(Integer.parseInt(s));
	}
}
