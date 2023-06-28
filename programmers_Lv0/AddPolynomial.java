package programmers_Lv0;

public class AddPolynomial {

	public static void main(String[] args) {
//		String polynomial = "3x + 7 + x";
		String polynomial = "x + x + x";
        StringBuilder answer = new StringBuilder();
        int coefficient = 0;
        int constant = 0;
        String str = "";
        
        for(String p : polynomial.split(" \\+ ")) {
        	if(p.contains("x")) {
        		str = p.substring(0, p.length()-1);
        		coefficient += !str.equals("") ? Integer.parseInt(str) : 1; 
        	} else {
        		constant += Integer.parseInt(p);
        	}
        }
        
        if(coefficient!=0) {
        	answer.append(coefficient!=1 ? coefficient : "").append("x");
        	
        	if(constant!=0) {
        		answer.append(" + ").append(constant);
        	}
        } else {
        	answer.append(constant);
        }
        	
        System.out.println(answer.toString());
	}

}
