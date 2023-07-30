package programmers_Lv0;

public class ConversionOfHydrothermalToMeetTheConditions2 {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181881
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int answer = 0;
		int count = 0;
		
		for(int a : arr) {
			count = -1;
			
			while(true) {
				count++;
				
				if(a>=50 && a%2==0) {
					a /= 2;
				} else if(a<50 && a%2==1) {
					a = a * 2 + 1;
				} else {
					answer = Math.max(answer, count);
					break;
				}
			}
		}
		    
		System.out.println(answer);
	}

}
