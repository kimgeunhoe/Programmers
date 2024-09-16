package programmers_Lv2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MasterOfPlayingAlone {
//	https://school.programmers.co.kr/learn/courses/30/lessons/131130
	public static void main(String[] args) {
//		int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};
//		int[] cards = {2, 3, 1};
		int[] cards = {10, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        boolean[] visited = new boolean[cards.length];
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<cards.length; i++) {
            if (!visited[i]) {
                int count = go(i, 0, cards, visited);
                q.add(count);
            }
        }

		System.out.println(q.size() < 2 ? 0 : q.poll() * q.poll());
	}

	private static int go(int current, int count, int[] cards, boolean[] visited) {
        if (!visited[current]) {
            int x = cards[current];
            visited[current] = true;
            count = go(x - 1, count + 1, cards, visited);
        }
        
        return count;
    }
}
