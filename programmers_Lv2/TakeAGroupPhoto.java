package programmers_Lv2;

import java.util.Arrays;
import java.util.List;

public class TakeAGroupPhoto {
	static boolean bool = true;
	static int answer = 0;
	
	public static void main(String[] args) {
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		Character[] characters = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
		List<Character> character = Arrays.asList(characters);
		char[][] condition = new char[n][4];
	    
	    for(int i=0; i<n; i++) {
	    	condition[i][0] = data[i].charAt(0);
	    	condition[i][1] = data[i].charAt(2);
	    	condition[i][2] = data[i].charAt(3);
	    	condition[i][3] = data[i].charAt(4);
	    }
	    
	    perm(character, 0, condition);
	    
	    System.out.println(answer);
	}

	public static void perm(List<Character> ch, int depth, char[][] con) {
		int terms = 0;
		int current = 0;
		
        if (depth==8) {
            for(int i=0; i<con.length; i++) {
            	terms = Character.getNumericValue(con[i][3])+1;
            	current = Math.abs(ch.indexOf(con[i][0])-ch.indexOf(con[i][1]));
            	
            	switch (con[i][2]) {
					case '=':
						if(terms!=current) {
							bool = false;
						}
						
						break;
					case '>':
						if(!(terms<current)) {
							bool = false;
						}
						
						break;
					case '<':
						if(!(terms>current)) {
							bool = false;
						}
						
						break;
					default:
						break;
				}
            	
            	if(!bool) {
            		break;
            	}
            }
            
            if(bool) {
            	answer++;
            } else {
            	bool = true;
            }
        }

        for(int i = depth; i<8; i++) {
            swap(ch, i, depth);
            perm(ch, depth + 1, con);
            swap(ch, i, depth);
        }
    }
	
	public static void swap(List<Character> ch, int i, int j) {
		char temp = ch.get(i);
        ch.set(i, ch.get(j));
        ch.set(j, temp);
	}
	
}
