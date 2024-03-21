package programmers_Lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunningRace {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		Map<String, Integer> order = new HashMap<>();
		int index = 0;
		
		for(int i=0; i<players.length; i++) {
			order.put(players[i], i);
		}
		
		for(String c : callings) {
			index = order.get(c);
			players[index] = players[index-1];
			players[index-1] = c;
			order.put(c, index - 1);
			order.put(players[index], index);
		}
		        
		System.out.println(Arrays.toString(players));
	}

}
