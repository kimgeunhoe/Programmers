package programmers_Lv2;

public class StringCompression {
//	https://school.programmers.co.kr/learn/courses/30/lessons/60057
	public static void main(String[] args) {
//		String s = "aabbaccc";
		String s = "ababcdcdababcdcd";
		int answer = s.length();
		
		for(int i=1; i<=s.length()/2; i++) {
			int count = 1;
			int length = 0;
			String now = "";
			
			for(int j=0; j<s.length(); j+=i) {
				String next = "";

				if(j+i<s.length()) {
					next = s.substring(j, j+i);
					
					if(now.equals(next)) {
						count++;
					} else {
						if(count>1) {
							length += getCountLength(count);
						}
						
						length += now.length();
						now = next;
						count = 1;
					}
				} else {
					next = s.substring(j);
					if(now.equals(next)) {
						length += getCountLength(++count) + i;
					} else {
						if(count>1) {
							length += getCountLength(count);
						}

						length += i + next.length();
					}
				}
			}
			
			answer = Math.min(answer, length);
		}
		
//		for(int i=1; i<=s.length()/2; i++) {
//			int count = 1;
//			String now = "";
//			StringBuilder sb = new StringBuilder();
//			
//			for(int j=0; j<s.length(); j+=i) {
//				String next = "";
//				
//				if(j+i<s.length()) {
//					next = s.substring(j, j+i);
//					
//					if(now.equals(next)) {
//						count++;
//					} else {
//						if(count>1) {
//							sb.append(count);
//						}
//						
//						sb.append(now);
//						now = next;
//						count = 1;
//					}
//				} else {
//					next = s.substring(j);
//					
//					if(now.equals(next)) {
//						sb.append(++count).append(now);
//					} else {
//						if(count>1) {
//							sb.append(count);
//						}
//						
//						sb.append(now).append(next);
//					}
//				}
//			}
//			
//			answer = Math.min(answer, sb.length());
//		}
		
		System.out.println(answer);
	}

	public static int getCountLength(int count) {
		return (int)Math.log10(count) + 1;
	}
}
