package programmers_Lv2;

public class Delivery {

	public static void main(String[] args) {
		int N = 5;
		int[][] road = {{1, 2, 1}, {2, 3, 3}, {5, 2, 2}, {1, 4, 2}, {5, 3, 1}, {5, 4, 2}};
		int K = 3;
	    int answer = 1;
	    int[][] arr = new int[N][N];
	    int a = 0;
	    int b = 0;
	    int c = 0;
	    
	    for(int i=0; i<N; i++) {
	    	for(int j=i+1; j<N; j++) {
	    		arr[i][j] = K + 1;
	    		arr[j][i] = K + 1;
	    	}
	    }
	        
	    for(int i=0; i<road.length; i++) {
	    	a = road[i][0] - 1;
	    	b = road[i][1] - 1;
	    	c = Math.min(arr[a][b], road[i][2]);

	    	arr[a][b] = c;
	    	arr[b][a] = c;
	    }
	    
	    for(int l=0; l<N; l++) {
	    	for(int i=N-1; i>=0; i--) {
	    		for(int j=i+1; j<N; j++) {
	    			arr[i][j] = Math.min(arr[i][j], arr[i][l] + arr[l][j]);
	    			arr[j][i] = Math.min(arr[j][i], arr[j][l] + arr[l][i]);
	    		}
	    	}
	    }
	    
	    for(int i=1; i<N; i++) {
	    	answer += arr[0][i]<=K ? 1 : 0;
	    }
	    
	    System.out.println(answer);
	}
}
