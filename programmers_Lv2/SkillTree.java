package programmers_Lv2;

public class SkillTree {
//	https://school.programmers.co.kr/learn/courses/30/lessons/49993
	public static void main(String[] args) {
		String skill= "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer = 0;
		
		l : for(String s : skill_trees) {
			int index = 0;

			for(int i=0; i<s.length(); i++) {
				int currentIndex = skill.indexOf(s.charAt(i));
				
				if(currentIndex==-1) {
					continue;
				} else if(index==currentIndex) {
					index++;
				} else {
					continue l;
				}
			}
			
			answer++;
		}
		
//		for(String s : skill_trees) {
//			s = s.replaceAll("[^" + skill + "]", "");
//			
//			if(s.length()==0 || s.equals(skill.substring(0, s.length()))) {
//				answer++;
//			}
//		}
        
		System.out.println(answer);
	}

}
