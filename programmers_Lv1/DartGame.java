package programmers_Lv1;

public class DartGame {

	public static void main(String[] args) {
		String dartResult = "1D2S#10S";
		String[] str = {};
		int[] score = new int[3];
		int point = 0;
		int index = 0;
		int pow =0;
		int answer = 0;
		
		str = dartResult.split("");
		
		for(int i=0; i<str.length; i=i+2) {
			if(str[i+1].equals("0")) {
				point = 10;
				i++;
			} else {
				point = Integer.parseInt(str[i]);
			}
			
			pow = str[i+1].equals("S") ? 1 : str[i+1].equals("D") ? 2 : 3;
			score[index] = (int)(Math.pow(point, pow));
			
			if(i+2<str.length) {
				if(str[i+2].equals("*")) {
					score[index] *= 2;
					
					if(index!=0) {
						score[index-1] *= 2;
					}
					
					i++;
				} else if(str[i+2].equals("#")) {
					score[index] *= -1;
					i++;
				}
			}

			index++;
		}
		
		for(int s : score) {
			answer += s;
		}
		
		System.out.println(answer);
	}

}
