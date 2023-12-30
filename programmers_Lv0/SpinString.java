package programmers_Lv0;

import java.util.Scanner;

public class SpinString {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181945
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(char c : a.toCharArray()) {
            System.out.println(c);
        }
	}

}
