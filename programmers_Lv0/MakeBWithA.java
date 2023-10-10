package programmers_Lv0;

import java.util.Arrays;

public class MakeBWithA {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 1;
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        for(int i=0; i<beforeArr.length; i++) {
        	if(beforeArr[i]!=afterArr[i]) {
        		answer = 0;
        		break;
        	}
        }
        
        System.out.println(answer);
	}

}
