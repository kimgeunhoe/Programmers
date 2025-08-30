package programmers_Lv1;

import java.util.HashMap;
import java.util.Map;

public class GiftReceivedTheMost {
//	https://school.programmers.co.kr/learn/courses/30/lessons/258712?language=java
	public static void main(String[] args) {
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		int answer = 0;
		Map<String, Map<String, Integer>> giftMap = new HashMap<>();
		
		for(String gift : gifts) {
			String[] g = gift.split(" ");
			String giver = g[0];
			String receiver = g[1];
			Map<String, Integer> receiverMap = giftMap.getOrDefault(giver, new HashMap<String, Integer>());
			Map<String, Integer> receive = giftMap.getOrDefault(receiver, new HashMap<String, Integer>());
			
			receiverMap.put(receiver, receiverMap.getOrDefault(receiver, 0) + 1);
			receiverMap.put("total", receiverMap.getOrDefault("total", 0) + 1);
			
			receive.put("total", receive.getOrDefault("total", 0) - 1);

			giftMap.put(giver, receiverMap);
			giftMap.put(receiver, receive);
		}
		
		for(String f : friends) {
			Map<String, Integer> receiverMap = giftMap.getOrDefault(f, new HashMap<String, Integer>());
			int nextMonthGiftCount = 0;

			for(String k : friends) {
				if(!"total".equals(k) && !f.equals(k)) {
					Map<String, Integer> receiver = giftMap.getOrDefault(k, new HashMap<String, Integer>());
					int giveCount = receiverMap.getOrDefault(k, 0);
					int receiveCount = receiver.getOrDefault(f, 0);
					
					if(giveCount>receiveCount || (giveCount==receiveCount && receiverMap.getOrDefault("total", 0)>receiver.getOrDefault("total", 0))) {
						nextMonthGiftCount++;
					}
				}
			}

			answer = Math.max(answer, nextMonthGiftCount);
		}
		
		System.out.println(answer);
	}

}
