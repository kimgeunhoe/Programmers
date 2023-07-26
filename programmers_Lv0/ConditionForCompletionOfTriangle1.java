package programmers_Lv0;

import java.util.Arrays;

public class ConditionForCompletionOfTriangle1 {

	public static void main(String[] args) {
//		int[] sides = {1, 2, 3};
		int[] sides = {199, 72, 222};
		
        Arrays.sort(sides);
        
        System.out.println(sides[0]+sides[1]>sides[2] ? 1 : 2);
	}

}
