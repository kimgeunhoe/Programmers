package programmers_Lv1;

public class SquareRoot {

	public static void main(String[] args) {
		long n = 121;
	    double root = Math.sqrt(n);

	    System.out.println(Math.ceil(root)==root ? (long)Math.pow(root + 1, 2) : -1);
	}

}
