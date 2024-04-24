package programmers_Lv2;

import java.util.Stack;

public class DeliveryBox {
	
	public static void main(String[] args) {
//		int[] order = {5, 4, 3, 2, 1};
		int[] order = {4, 3, 1, 2, 5};
		int answer = 1;
	    int[] mainCon = new int[order.length];
	    Stack<Integer> subCon = new Stack<>();
	    
	    for(int o : order) {
	    	mainCon[o-1] = answer++;
	    }

	    answer = 0;
	    
	    for(int m : mainCon) {
	    	if(m==answer+1) {
	    		answer++;

	    		while(!subCon.empty() && subCon.peek()==answer+1) {
	    			answer++;
	    			subCon.pop();
	    		}
	    	} else {
	    		subCon.push(m);
	    	}
	    }
	    
//	    int answer = 0;
//        Stack<Integer> subContainer = new Stack<>();
//
//        int index = 0;
//        for(int boxNum = 1; boxNum <= order.length; boxNum++) {
//            int curBoxNum = order[index];
	    
//            if(curBoxNum == boxNum) {
//                answer++;
//                index++;
//
//                while(subContainer.size() > 0 && index < order.length) {    
//                    if(subContainer.peek() == order[index]) {
//                        answer++;
//                        subContainer.pop();
//                        index++;
//                    } else {
//                        break;
//                    }
//                }
//            } else {
//                subContainer.add(boxNum);
//            }
//        }
//        
	    System.out.println(answer);
	}
}
