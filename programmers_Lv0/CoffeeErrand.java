package programmers_Lv0;

public class CoffeeErrand {

	public static void main(String[] args) {
		String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
		int answer = 0;
		        
		for(String o : order) {
			answer += o.contains("cafelatte") ? 5000 : 4500;
		}
		
		System.out.println(answer);
	}

}
