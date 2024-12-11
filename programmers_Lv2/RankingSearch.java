package programmers_Lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankingSearch {
//	https://school.programmers.co.kr/learn/courses/30/lessons/72412
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
		int[] answer = new int[query.length];
		
//		for(int i=0; i<query.length; i++) {
//			String[] queryOption = query[i].split(" and ");
//			String[] queryFoodAndScore = queryOption[3].split(" ");
//			
//			l : for(String in : info) {
//				String[] infoOption = in.split(" ");
//
//				for(int j=0; j<queryOption.length-1; j++) {
//					if(!compareOption(queryOption[j], infoOption[j])) {
//						continue l;
//					}
//				}
//
//				if(compareOption(queryFoodAndScore[0], infoOption[3]) && Integer.parseInt(infoOption[4])>=Integer.parseInt(queryFoodAndScore[1])) {
//					answer[i]++;
//				}
//			}
//		}
		
		Map<String, Integer> queryMap = new HashMap<>();
		
		for(String q : query) {
			q = q.replace(" and ", "");
			String[] option = q.split(" ");
			
			queryMap.put(option[0], Integer.parseInt(option[1]));
		}
		
		
		
		System.out.println(Arrays.toString(answer));
	}

	public static boolean compareOption(String queryOption, String infoOption) {
		return "-".equals(queryOption) || queryOption.equals(infoOption);
	}
}
