package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ToProceedWithTheAssignment {
//	https://school.programmers.co.kr/learn/courses/30/lessons/176962
	public static void main(String[] args) {
		String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
		Homework[] plan = new Homework[plans.length];
        
		for(int i=0; i<plans.length; i++) {
            plan[i] = new Homework(plans[i]);
        }
        
		Arrays.sort(plan, (a, b) -> a.start - b.start); 

        Stack<Homework> stop = new Stack<>();
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i < plans.length - 1; i++) {
        	Homework curPlan = plan[i];
        	Homework nextPlan = plan[i + 1];

            if(curPlan.getEndTime() > nextPlan.start) {
                curPlan.playTime = curPlan.getEndTime() - nextPlan.start;
                stop.push(curPlan);
               
                continue;
            }
            
            answer.add(curPlan.name);

            int restTime = nextPlan.start - curPlan.getEndTime();
            
            while(restTime>0 && !stop.isEmpty()) {
            	Homework stoppedPlan = stop.peek();
                int timeDiff = stoppedPlan.playTime - restTime;
                
                stoppedPlan.playTime = timeDiff;
                restTime = timeDiff * -1;
                
                if(timeDiff>0) {
                	break;
                }
                
                answer.add(stop.pop().name);
            }
        }

        answer.add(plan[plan.length - 1].name);
        
        while(!stop.isEmpty()) {
        	answer.add(stop.pop().name);
        }
        
        System.out.println(Arrays.toString(answer.toArray(new String[answer.size()])));
	}

	static class Homework {
	    String name;
	    int start;
	    int playTime;

	    public Homework(String name, String start, String playTime) {
	        this.name = name;
	        String[] time = start.split(":");
	        this.start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
	        this.playTime = Integer.parseInt(playTime);
	    }

	    public Homework(String[] plan) {
	        this(plan[0], plan[1], plan[2]);
	    }

	    public int getEndTime() {
	        return start + playTime;
	    }
	}
}
