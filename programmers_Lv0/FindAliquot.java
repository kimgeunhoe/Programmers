package programmers_Lv0;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindAliquot {

	public static void main(String[] args) {
		int n = 24;
		int[] answer = {};
        Queue<Integer> aliquot = new PriorityQueue<>();
        int sqrt = (int)Math.sqrt(n);
        int index = 0;

        for(int i=1; i<=sqrt; i++) {
            if(n%i==0) {
                aliquot.add(i);
                aliquot.add(n/i);               
            }
        }

        if(sqrt*sqrt==n) {
            aliquot.remove(sqrt);
        }

        answer = new int[aliquot.size()];

        while(!aliquot.isEmpty()) {
            answer[index++] = aliquot.poll();
        }

        System.out.println(Arrays.toString(answer));
	}

}
