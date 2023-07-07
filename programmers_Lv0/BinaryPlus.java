package programmers_Lv0;

public class BinaryPlus {

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";

		System.out.println(Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2)));
	}

}
