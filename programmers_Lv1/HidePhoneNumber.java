package programmers_Lv1;

public class HidePhoneNumber {

	public static void main(String[] args) {
		String phone_number = "01033334444";
		String answer = "";
		
		answer = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*") + phone_number.substring(phone_number.length()-4, phone_number.length());
//		phone_number.replaceAll(".(?=.{4})", "*");
		
		System.out.println(answer);
	}

}
