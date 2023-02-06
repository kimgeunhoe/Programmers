package programmers_Lv0;

public class ReverseArray {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int length = num_list.length;
        int[] answer = new int[length];

        for(int i=0; i<length; i++) {
        	answer[length-1-i] = num_list[i];
        }
        
        for(int a : answer) {
        	System.out.println(a);
        }
	}

}
