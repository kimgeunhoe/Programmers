package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int a : arr) {
        	if(list.get(list.size()-1)!=a) {
        		list.add(a);
        	}
        }
        
        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
        //System.out.println(Arrays.toString(list.stream().mapToInt(l -> l).toArray()));
	}

}
