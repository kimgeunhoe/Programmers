package programmers_Lv0;

public class TailString {

	public static void main(String[] args) {
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		StringBuilder sb = new StringBuilder();
        
        for(String s : str_list) {
            if(!s.contains(ex)) {
                sb.append(s);
            }
        }
        
        System.out.println(sb.toString());
	}

}
