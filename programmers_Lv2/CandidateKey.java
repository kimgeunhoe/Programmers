package programmers_Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CandidateKey {
//	https://school.programmers.co.kr/learn/courses/30/lessons/42890
	public static void main(String[] args) {
		String[][] relation = {{"100","ryan","music","2"}, {"200","apeach","math","2"}, {"300","tube","computer","3"}, {"400","con","computer","4"}, {"500","muzi","music","3"}, {"600","apeach","music","2"}};
		int answer = 0;
		int attributeCount = relation[0].length;
		Map<Integer, List<String>> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		List<int[]> option = new ArrayList<>();
		
		for(int i=1; i<=attributeCount; i++) {
			sb.append('1');
			map.put(i, new ArrayList<>());
		}

		for(int i=1; i<=Integer.parseInt(sb.toString(), 2); i++) {
			String binary = Integer.toBinaryString(i);
			int length = binary.length();
			int count = Integer.bitCount(i);
			StringBuilder binarySb = new StringBuilder();
			
			for(int j=0; j<attributeCount-length; j++) {
				binarySb.append(0);
			}
			
			binarySb.append(binary);
			
			map.get(count).add(binarySb.toString());
		}

		for(int i=1; i<=attributeCount; i++) {
			List<String> binaryList = map.get(i);

			l : for(String binary : binaryList) {
				Set<String> set = new HashSet<>();
				int[] indexArray = new int[i];
				int index = 0;
				
				ll : for(int[] opt : option) {
					for(int o : opt) {
						if(binary.charAt(o)=='0') {
							continue ll;
						}
					}
					
					continue l;
				}

				for(int j=0; j<attributeCount && index<i; j++) {
					if(binary.charAt(j)=='1') {
						indexArray[index++] = j;
					}
				}
				
				for(String[] r : relation) {
					StringBuilder attributes = new StringBuilder();
					
					for(int ind : indexArray) {
						attributes.append(r[ind]).append(' ');
					}

					if(!set.add(attributes.toString())) {
						continue l;
					}
				}

				answer++;
				option.add(indexArray);
			}
		}

		System.out.println(answer);
	}

}
