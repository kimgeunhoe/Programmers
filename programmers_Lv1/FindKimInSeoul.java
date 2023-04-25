package programmers_Lv1;

public class FindKimInSeoul {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		StringBuilder answer = new StringBuilder();

	    for(int i=0; i<seoul.length; i++) {
	    	if(seoul[i].equals("Kim")) {
	    		answer.append("김서방은 ");
                answer.append(i);
                answer.append("에 있다");
	    		break;
	    	}
	    }

	    System.out.println(answer.toString());
	}

}
