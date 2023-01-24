package programmers_Lv0;

public class PrintRightTriangle {

	public static void main(String[] args) {
		int n = 3;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
//		for(int i=1; i<=n; i++) {
//			System.out.println("*".repeat(i)); //자바11부터
//		}
	}

}
