package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortFileNames {

	public static void main(String[] args) {
		//String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		//String[] files = {"F13.png", "F14", "f013", "F014", "F013.TXT"};
		//String[] files = {"a000011", "a00001"};
		//String[] files = {"a0001", "a001", "a000001"};
		String[] files = {"F-15", "f15", "F15.png"};
		//String[] files = {"muzi1.png1", "MUZI1.png2", "MUZI1.png3", "muzi1.png4"};
		//String[] files = {"O00321", "O49qcGPHuRLR5FEfoO00321"};
	    String[] answer = new String[files.length];
	    Set<String> head = new HashSet<>();
	    Set<Integer> number = new HashSet<>();
	    List<String> headList = new ArrayList<>();
	    List<String> numberList = new ArrayList<>();
	    List<Integer> numList;
	    String str = "";
	    int index = 0;
	    
	    for(String f : files) {
	    	head.add(f.substring(0, f.replaceAll("[0-9]", "*").indexOf("*")).toLowerCase());
	    }
	    
	    headList = new ArrayList<>(head);
	    Collections.sort(headList);
	    
	    for(String h : headList) {
	    	number.clear();

	    	for(String f : files) {
	   			if(f.length()>=h.length() && f.substring(0, h.length()).compareToIgnoreCase(h)==0 && f.charAt(h.length())>='0' && f.charAt(h.length())<='9') {
	    			str = f.substring(h.length()).replaceAll("[^0-9]", " ");
	    			
	    			if(str.contains(" ")) {
	    				str = str.substring(0, str.indexOf(" "));
	    			}
	    			
	    			if(str.length()>5) {
	    				str = str.substring(0, 5);
	    			}
	    			
	    			number.add(Integer.parseInt(str));
	    			numberList.add(f);
	    		}
	    	}
	    	
	    	numList = new ArrayList<>(number);
	    	Collections.sort(numList);
	    	
	    	for(int n : numList) {
	    		for(int i=0; i<numberList.size(); i++) {
	    			String nl = numberList.get(i);
	    			
	    			str = nl.substring(h.length()).replaceAll("[^0-9]", " ");
	    			
	    			if(str.contains(" ")) {
	    				str = str.substring(0, str.indexOf(" "));
	    			}
	    			
	    			if(str.length()>5) {
	    				str = str.substring(0, 5);
	    			}
	    			
	    			if(Integer.parseInt(str)==n) {
	    				answer[index++] = nl;
	    				numberList.remove(i--);
	    			}
	    		}
	    	}
	    }
	    
	    System.out.println(Arrays.toString(answer));
	}

}
