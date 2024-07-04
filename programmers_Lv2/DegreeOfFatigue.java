package programmers_Lv2;

public class DegreeOfFatigue {
//	https://school.programmers.co.kr/learn/courses/30/lessons/87946
	public static int answer = 0;
	
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80, 20}, {50, 40}, {30,10}};
		boolean[] visited = new boolean[dungeons.length];

		dfs(dungeons, visited, k, 0);
        
        System.out.println(answer);
	}

	public static void dfs(int[][] dungeons, boolean[] visited, int k, int count){
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k>=dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, visited, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }     
        
        if(answer<count) {
            answer = count;
        }
    }

}
