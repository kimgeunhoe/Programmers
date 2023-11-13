package programmers_Lv0;

import java.util.Scanner;

public class PrintCaseByCase {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181949
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] c = a.toCharArray();
        
        for(int i=0; i<c.length; i++) {
            c[i] = Character.isLowerCase(c[i]) ? Character.toUpperCase(c[i]) : Character.toLowerCase(c[i]);
        }
        
        System.out.print(String.valueOf(c));
	}

}
