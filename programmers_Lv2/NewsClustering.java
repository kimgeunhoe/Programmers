package programmers_Lv2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {

	public static void main(String[] args) {
		String str1 = "FRANCE";
		String str2 = "french";
	    int answer = 0;
	    List<String> list1 = new ArrayList<>();
	    List<String> list2 = new ArrayList<>();
	    int count = 0;
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	    
	    for(int i=0; i<str1.length()-1; i++) {
	    	if(str1.charAt(i)>='a' && str1.charAt(i)<='z') {
	    		if(str1.charAt(i+1)>='a' && str1.charAt(i+1)<='z') {
	    			list1.add(str1.substring(i, i+2));
	    		} else {
	    			i++;
	    		}
	    	}
	    }
	    
	    for(int i=0; i<str2.length()-1; i++) {
	    	if(str2.charAt(i)>='a' && str2.charAt(i)<='z') {
	    		if(str2.charAt(i+1)>='a' && str2.charAt(i+1)<='z') {
	    			list2.add(str2.substring(i, i+2));
	    		} else {
	    			i++;
	    		}
	    	}
	    }
	    
	    if(list1.size()>0 || list2.size()>0) {
	    	answer = list1.size() + list2.size();
	    	
	    	for(int i=0; i<list1.size(); i++) {
	    		for(int j=0; j<list2.size(); j++) {
	    			if(list1.get(i).equals(list2.get(j))) {
	    				count++;
	    				list1.remove(i--);
	    				list2.remove(j);
	    				break;
	    			}
	    		}
	    	}
	    	
	    	answer = 65536 * count / (answer - count);
	    } else if(list1.size()+list2.size()==0) {
	    	answer = 65536;
	    }
	    
	    System.out.println(answer);
	}

}
