package programmers_Lv2;

import java.util.Arrays;

public class NoMoreThanTwoDifferentBits {
//	https://school.programmers.co.kr/learn/courses/30/lessons/77885
	public static void main(String[] args) {
		long[] numbers = {2, 7};
		int numbersLength = numbers.length;
		long[] answer = new long[numbersLength];
		
		for(int i=0; i<numbersLength; i++) {
			long number = numbers[i];
			
			if(number%2==0) {
				answer[i] = number + 1;
			} else {
				String numberBinary = new StringBuilder("0").append(Long.toBinaryString(number)).toString();
				int numberBinaryLength = numberBinary.length();
				char[] numberBinaryArray = numberBinary.toCharArray();
				
				for(int j=numberBinaryLength-1; j>=0; j--) {
					if(numberBinaryArray[j]=='0') {
						numberBinaryArray[j] = '1';
						
						if(number%2==1) {
							numberBinaryArray[j+1] = '0';
						}
						
						break;
					}
				}
				
				numberBinary = String.valueOf(numberBinaryArray);
				answer[i] = Long.parseLong(numberBinary, 2);
			}
		}

		System.out.println(Arrays.toString(answer));
	}

}
