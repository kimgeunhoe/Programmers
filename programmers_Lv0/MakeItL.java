package programmers_Lv0;

public class MakeItL {

	public static void main(String[] args) {
		String myString = "abcdevwxyz";
		char[] arr = myString.toCharArray();
				
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<'l') {
				arr[i] = 'l';
			}
		}
		
		System.out.println(String.valueOf(arr));
	}

}
