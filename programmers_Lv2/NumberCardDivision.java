package programmers_Lv2;

//	https://school.programmers.co.kr/learn/courses/30/lessons/135807
public class NumberCardDivision {

	public static void main(String[] args) {
//		int[] arrayA = {10, 17};
//		int[] arrayB = {5, 20};
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		int answer = 0;
		int max = Math.max(getMin(arrayA), getMin(arrayB));
		
		l : for(; max>1; max--) {
			boolean a = divide(arrayA[0], max);
			boolean b = divide(arrayB[0], max);

			if(a!=b) {
				for(int i=1; i<arrayA.length; i++) {
					if(divide(arrayA[i], max)!=a || divide(arrayB[i], max)!=b) {
						continue l;
					}
				}

				answer = max;
				break;
			}
		}
		
		System.out.println(answer);
	}

	public static boolean divide(int num, int divisor) {
        return num % divisor == 0;
    }
	
	public static int getMin(int[] array) {
		int min = array[0];
				
		for(int i=1; i<array.length; i++) {
			min = Math.min(min, array[i]);
		}
		
		return min;
	}
}
