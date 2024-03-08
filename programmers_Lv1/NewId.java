package programmers_Lv1;

public class NewId {

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		StringBuilder sb = new StringBuilder();
        
        new_id = new_id.toLowerCase().replaceAll("[^a-z0-9-_.]", "");
        
        while(new_id.contains("..")) {
        	new_id = new_id.replace("..", ".");
        }
        
        if(new_id.startsWith(".")) {
        	new_id = new_id.substring(1);
        }
        
        if("".equals(new_id)) {
        	new_id = "a";
        }
        
        if(new_id.length()>=16) {
        	new_id = new_id.substring(0, 15);
        }
        
        if(new_id.endsWith(".")) {
        	new_id = new_id.substring(0, new_id.length() - 1);
        }
        
        sb.append(new_id);
        
        while(sb.length()<3) {
        	sb.append(new_id.charAt(new_id.length()-1));
        }
		
		System.out.println(sb.toString());
	}

}
