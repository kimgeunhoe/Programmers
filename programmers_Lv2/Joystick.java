package programmers_Lv2;

public class Joystick {

	public static void main(String[] args) {
//		String name = "JEROEN";
		String name = "JAZ";
//		String name = "AAA";
		int answer = 0;
        int length = name.length();
        int index = 0;
        int move = length - 1;
        char c = 0;

        for(int i=0; i<length; i++) {
        	c = name.charAt(i);
            answer += Math.min(c - 'A', 91 - c);
            index = i + 1;

            while(index<length && name.charAt(index)=='A') {
                index++;
            }

            move = Math.min(Math.min(move, (length - index) * 2 + i), i * 2 + length - index);
        }
		
		System.out.println(answer + move);
	}

}
