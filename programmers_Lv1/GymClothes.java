package programmers_Lv1;

public class GymClothes {

	public static void main(String[] args) {
		int n = 4;
		int[] lost = {2, 3};
		int[] reserve = {3, 4};
//		int n = 5;
//		int[] lost = {2, 4};
//		int[] reserve = {1, 3, 5};
		int[] student = new int[n];
		
        for(int l : lost) {
        	student[l-1]--;
        }
    
        for(int r : reserve) {
        	student[r-1]++;
        }
        
        for(int i=0; i<student.length; i++) {
        	if(student[i]==-1) {
        		if(i>0 && student[i-1]==1) {
        			student[i-1] = 0;
        			student[i] = 0;
        		} else if(i<student.length-1 && student[i+1]==1){
        			student[i+1] = 0;
        			student[i] = 0;
        		} else {
        			n--;
        		}
        	}
        }
        
        System.out.println(n);
	}
}
