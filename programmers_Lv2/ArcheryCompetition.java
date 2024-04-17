package programmers_Lv2;

public class ArcheryCompetition {
	static int[] lion = new int[11];
	static int max = 0;
	static int[] answer = new int[] {-1};
	
	public static void main(String[] args) {
//		int n = 5;
//		int[] info = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
		int n = 9;
		int[] info = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};
//		int n = 10;
//		int[] info = {0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3};
//		int n = 1;
//		int[] info = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		addfare(info, 1, n);
		
		for(int a : answer) {
			System.out.print(a);
		}
	}

	static public void addfare(int[] info, int cnt, int n) {
        if(cnt==n+1) {
            int diffScore = 0;
            
            for(int i=0; i<10; i++) 
            {
                if(info[i]!=0 || lion[i]!=0) {
                	diffScore += info[i]<lion[i] ? 10 - i : i - 10;
                }
            }
            
            if(diffScore>0 && diffScore>=max) {
                answer = lion.clone();
                max = diffScore;
            }
            
            return;
        }
        
        for(int j=0; j<=10 && lion[j]<=info[j]; j++) {
            lion[j]++;
            addfare(info, cnt + 1, n);
            lion[j]--;
        }
    }
}
