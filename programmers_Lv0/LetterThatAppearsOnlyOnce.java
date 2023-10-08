package programmers_Lv0;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;

public class LetterThatAppearsOnlyOnce {

	public static void main(String[] args) {
		String s = "abcabcadc";
	    StringBuilder answer = new StringBuilder();
	    int length = 0;
//	    String str = "";
//	    List<String> list = new ArrayList<>();
	    
	    for(char c='a'; c<='z' && s.length()!=0; c++) {
	    	length = s.length();
	    	s = s.replace(Character.toString(c), "");

	    	if(s.length()==length-1) {
	    		answer.append(c);
	    	}
	    }
	    
	    System.out.println(answer.toString());
	
//	    for(int i=0; i<s.length();) {
//	    	length = s.length();
//	    	str = Character.toString(s.charAt(i));
//	    	s = s.replace(str, "");
//
//	    	if(s.length()==length-1) {
//	    		list.add(str);
//	    	}
//	    }
//	    
//	    Collections.sort(list);
//	    System.out.println(list.stream().collect(Collectors.joining()));
//	    list.stream().forEach(l -> answer.append(l));
	    
//	    System.out.println(answer.toString());
	}

}
