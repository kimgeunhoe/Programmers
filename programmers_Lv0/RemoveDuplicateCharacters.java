package programmers_Lv0;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String my_string = "people";
		Set<Character> set = new LinkedHashSet<Character>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
        	set.add(my_string.charAt(i));
        }
        
        for(char s : set) {
        	sb.append(s);
        }

        System.out.println(sb.toString());
	}

}
