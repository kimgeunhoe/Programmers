package programmers_Lv0;

public class RockScissorsPaper {

	public static void main(String[] args) {
		String rsp = "205";
//	        String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<rsp.length(); i++) {
			sb.append(rsp.charAt(i)=='2' ? '0' : rsp.charAt(i)=='0' ? '5' : '2');
		}
		
		System.out.println(sb.toString());
	}

}
