package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseMultipleOfN {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for(int nl : numlist) {
        	if(nl%n==0) {
        		list.add(nl);
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
