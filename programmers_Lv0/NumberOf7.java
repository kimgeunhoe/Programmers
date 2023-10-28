package programmers_Lv0;

public class NumberOf7 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
        StringBuilder sb = new StringBuilder();
        
        for(int a : array) {
        	sb.append(a);
        }
        
        System.out.println(sb.toString().replaceAll("[^7]", "").length());
        
        
        int answer = 0;
        
        for(int a :array) {
        	while(a>6) {
        		if(a%10==7) {
        			answer++;
        		}
        		
        		a /= 10;
        	}
        }
        
        System.out.println(answer);
	}

}
