package programmers_Lv0;

public class AgeOfExoplanet {

	public static void main(String[] args) {
		int age = 23;
		String str = String.valueOf(age);
	    StringBuilder answer = new StringBuilder(); 
	    
	    for(int i=0; i<str.length(); i++) {
	    	answer.append((char)(97+Character.getNumericValue(str.charAt(i))));
	    }

	    System.out.println(answer.toString());
	}

}
