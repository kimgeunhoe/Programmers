package programmers_Lv0;

public class ThrowingBall {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		int k = 2;
        
//        System.out.println(numbers[(k*2-2)%numbers.length]);
        System.out.println((k*2-1)%numbers.length);
	}

}
