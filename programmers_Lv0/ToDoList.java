package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoList {
//	https://school.programmers.co.kr/learn/courses/30/lessons/181885
	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		String[] answer = {};
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<todo_list.length; i++) {
			if(!finished[i]) {
				list.add(todo_list[i]);
			}
		}
		        
		System.out.println(Arrays.toString(list.toArray(answer)));
	}

}
