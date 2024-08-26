package programmers_Lv2;

import java.util.Arrays;
//import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
//		int[] numbers = {6, 10, 2};
		int length = numbers.length;
	    String[] str = new String[length];
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0; i<length; i++) {
	    	str[i] = Integer.toString(numbers[i]);
	    }
	    
//	    Arrays.sort(str, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return (o2+o1).compareTo(o1+o2);
//			}
//		});

	    Arrays.sort(str, (s1, s2) -> (s2+s1).compareTo(s1+s2));
	    
	    for(String s : str) {
	    	sb.append(s);
	    }
	    
	    System.out.println("0".equals(str[0]) ? "0" : sb.toString());
	}

}
