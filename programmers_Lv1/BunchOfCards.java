package programmers_Lv1;

public class BunchOfCards {

	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		String answer = "Yes";
		int index1 = 0;
		int index2 = 0;
		
		for(String g : goal) {
			if(index1<cards1.length && g.equals(cards1[index1])) {
				index1++;
			} else if(index2<cards2.length && g.equals(cards2[index2])) {
				index2++;
			} else {
				answer = "No";
				break;
			}
		}
		
		System.out.println(answer);
	}

}
