package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDeleteElementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        l : for(int a : arr) {
            for(int d : delete_list) {
                if(a==d) {
                    continue l;
                }
            }

            list.add(a);
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<list.size(); answer[i]=list.get(i++));
        
        System.out.println(Arrays.toString(answer));
	}

}
