package programmers_Lv2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		String numbers = "17";
		int answer = 0;
        Queue<Num> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        char[] arr = numbers.toCharArray();
        
        for(int i=0; i<arr.length; i++) {
        	char[] check = arr.clone();
        	StringBuilder charNum = new StringBuilder();
        	
        	charNum.append(check[i]);
        	check[i] = ' ';
        	q.add(new Num(charNum, check));
        	
        	while(!q.isEmpty()) {
        		Num num = q.poll();
                
                check = num.getArr();
                charNum = num.getNumber();
        		set.add(Integer.parseInt(charNum.toString()));
        		
        		if(charNum.length()<numbers.length()) {
        			for(int j=0; j<check.length; j++) {
        				if(check[j]!=' ') {
        					char[] charArr = check.clone();
        					StringBuilder sb = new StringBuilder(charNum).append(check[j]);
                            
        					charArr[j] = ' ';
        					q.add(new Num(sb, charArr));
        				}
        			}
        		}
        	}
        }
 
        set.removeIf(s -> s<2);
        answer = set.size();
        
        for(int s : set) {
        	for(int i=2; i<=Math.sqrt(s); i++) {
        		if(s%i==0) {
        			answer--;
        			break;
        		}
        	}
        }

		System.out.println(answer);
	}

	static class Num {
		private StringBuilder number;
		private char[] arr;
		
		public Num(StringBuilder number, char[] arr) {
			this.number = number;
			this.arr = arr;
		}

		public StringBuilder getNumber() {
			return number;
		}

		public char[] getArr() {
			return arr;
		}
	}
}
