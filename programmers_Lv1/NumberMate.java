package programmers_Lv1;

public class NumberMate {

	public static void main(String[] args) {
		String X = "100";
		String Y = "2345";
//		String Y = "203045";
//		String Y = "123450";		
		
		
		StringBuilder answer = new StringBuilder();
		int min = 0;
		int[] x = new int[10];
		int[] y = new int[10];
		
		for(int i=0; i<X.length(); i++) {
			x[Character.getNumericValue(X.charAt(i))]++;
		}
		
		for(int i=0; i<Y.length(); i++) {
			y[Character.getNumericValue(Y.charAt(i))]++;
		}
		
		for(int i=9; i>=0; i--) {
			min = Math.min(x[i], y[i]);
			if(min!=0) {
				for(int j=0; j<min; j++) {
					answer.append(i);
				}
			}
		}
		
		if(answer.toString().equals("")) {
        	System.out.println("-1");
        } else if(answer.toString().charAt(0)==48) {
        	System.out.println("0");
        } else {
        	System.out.println(answer.toString());
        }
		
		
		
//		StringBuilder answer = new StringBuilder();
//		int min = 0;
//		int[] n = new int[10];
//		
//		for(int k=0; k<=9; k++) {
//			min = Math.min(X.length() - X.replace(String.valueOf(k), "").length(), Y.length() - Y.replace(String.valueOf(k), "").length());
//			n[k] = min;
//		}
//		
//		for(int k=9; k>=0; k--) {
//			if(n[k]!=0) {
//				for(int i=0; i<n[k]; i++) {
//					answer.append(k);
//				}
//			}
//		}
//		
//		if(String.valueOf(answer).equals("")) {
//        	System.out.println("-1");
//        } else if(Integer.parseInt(String.valueOf(answer))==0) {
//        	System.out.println("0");
//        } else {
//        	System.out.println(answer.toString());
//        }
	}

}
