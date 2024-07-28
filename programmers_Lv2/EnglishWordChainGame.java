package programmers_Lv2;

import java.util.Arrays;

public class EnglishWordChainGame {
//	https://school.programmers.co.kr/learn/courses/30/lessons/12981
	public static void main(String[] args) {
//		int n = 3;
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer = {0, 0};
        boolean bool = true;
        
        for(int i=1; i<words.length; i++) {
        	bool = words[i].length()>1 & words[i-1].charAt(words[i-1].length()-1)==words[i].charAt(0);
 
        	if(bool) {
        		for(int j=0; j<i; j++) {
        			if(words[i].equals(words[j])) {
        				bool = false;
        				break;
        			}
        		}
        	}
        	
        	if(!bool) {
        		answer[0] = i%n+1;
        		answer[1] = i/n+1;
        		break;
        	}
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
