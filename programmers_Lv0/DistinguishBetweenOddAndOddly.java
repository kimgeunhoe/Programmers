package programmers_Lv0;

import java.util.Scanner;

public class DistinguishBetweenOddAndOddly {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181944
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(n + " is " + (n%2==0 ? "even" : "odd"));
	}

}
