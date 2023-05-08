package programmers_Lv1;

public class MakeStrangeString {

	public static void main(String[] args) {
        String s = "try hello world";      
        
        String[] str = s.split(" ");
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<str.length; i++) {
        	for(int j=0; j<str[i].length(); j++) {
        		answer.append(j%2==0 ? String.valueOf(str[i].charAt(j)).toUpperCase() : String.valueOf(str[i].charAt(j)).toLowerCase());
        	}
        	answer.append(i!=str.length-1 ? " " : "");
        }
        
        while(s.length()!=answer.length()) {
        	answer.append(" ");
        }
        
        
//        String[] str = s.split("");
//        int index = 0;
//        StringBuilder answer = new StringBuilder();
//        
//        for(String st : str) {
//        	if(st.equals(" ")) {
//        		answer.append(" ");
//        		index = 0;
//        	} else {
//        		answer.append(index%2==0 ? st.toUpperCase() : st.toLowerCase());
//        		index++;
//        	}
//        }
        
        System.out.println(answer.toString());
	}

}
