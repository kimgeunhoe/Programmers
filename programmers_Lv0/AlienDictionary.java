package programmers_Lv0;

public class AlienDictionary {

	public static void main(String[] args) {
		String[] spell = {"p", "o", "s"};
		String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int answer = 2;

        for(String d : dic) {
        	if(spell.length==d.length()) {
        		for(String s : spell) {
        			if(!d.contains(s)) {
        				answer = 2;
        				break;
        			} else {
        				answer = 1;
        			}
        		}
        		
        		if(answer==1) {
        			break;
        		}
        	}
        }
        
        System.out.println(answer);
	}

}
