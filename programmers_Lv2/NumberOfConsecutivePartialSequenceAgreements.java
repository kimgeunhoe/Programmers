package programmers_Lv2;

import java.util.HashSet;
import java.util.Set;

public class NumberOfConsecutivePartialSequenceAgreements {

	public static void main(String[] args) {
		int[] elements = {7, 9, 1, 1, 4};
	    int num = 0;
	    int total = 0;
	    int el = elements.length;
	    Set<Integer> set = new HashSet<>();
	    
	    for(int i=0; i<el; i++) {
	    	total += elements[i];
	    	num = elements[i];
	    	set.add(num);

	    	for(int j=i+1; j<i+el-1; j++) {
	    		num += elements[j<el ? j : j-el];
	    		set.add(num);
	    	}
	    }
	    
	    set.add(total);
	    
	    System.out.println(set.size());
	}

}
