package programmers_Lv1;

public class FoodFightContest {

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		StringBuilder order = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        
        for(int i=1; i<food.length; i++) {
        	//order.append(String.valueOf(i).repeat(food[i]/2));
        	for(int j=0; j<food[i]/2; j++) {
        		order.append(i);
        	}
        }
        
        reverse.append(order);

        System.out.println(order.append(0).append(reverse.reverse()).toString());
	}

}
