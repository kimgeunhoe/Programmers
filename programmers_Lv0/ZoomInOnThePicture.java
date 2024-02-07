package programmers_Lv0;

import java.util.Arrays;

public class ZoomInOnThePicture {

	public static void main(String[] args) {
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
		int length = picture.length;
        String[] answer = new String[length*k];
        StringBuilder sb = new StringBuilder();
        String str = "";
        
        for(int i=0; i<length; i++) {
            str = picture[i];
            
            for(int x=0; x<str.length(); x++) {              
                for(int y=0; y<k; y++) {
                    sb.append(str.charAt(x));
                }
            }
            
            str = sb.toString();
            
            for(int j=0; j<k; j++) {
                answer[k*i+j] = str;
            }
            
            sb.setLength(0);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
