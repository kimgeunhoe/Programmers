package programmers_Lv0;

public class SuccessfulLogin {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
	    String answer = "fail";

	    for(int i=0; i<db.length; i++) {
	    	if(id_pw[0].equals(db[i][0])) {
	    		answer = id_pw[1].equals(db[i][1]) ? "login" : "wrong pw";
	    		break;
	    	}
	    }
	    
	    System.out.println(answer);
	}

}
