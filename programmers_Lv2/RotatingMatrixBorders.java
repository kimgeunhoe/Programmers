package programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotatingMatrixBorders {
//	https://school.programmers.co.kr/learn/courses/30/lessons/77485
	public static void main(String[] args) {
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
		int length = queries.length;
		int[] answer = new int[length];
		int[][] matrix = new int[rows][columns];
		int num = 1;
		int min = 0;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; matrix[i][j++]=num++);
		}
		
		for(int i=0; i<length; i++) {
			List<int[]> indexList = new ArrayList<>();
			List<Integer> numList = new ArrayList<>();
			int[] query = queries[i];
			
			for(int j=0; j<query.length; j++) {
				query[j]--;
			}
			
			for(int j=query[1]; j<=query[3]; j++) {
				numList.add(matrix[query[0]][j]);
				indexList.add(new int[] {query[0], j});
			}
			
			for(int j=query[0]; j<=query[2]; j++) {
				numList.add(matrix[j][query[3]]);
				indexList.add(new int[] {j, query[3]});
			}
			
			for(int j=query[3]; j<=query[1]; j--) {
				numList.add(matrix[query[2]][j]);
				indexList.add(new int[] {query[2], j});
			}
			
			for(int j=query[2]; j<=query[0]; j--) {
				numList.add(matrix[query[1]][j]);
				indexList.add(new int[] {query[1], j});
			}
			
			int[] index = indexList.get(0);
			
			matrix[index[0]][index[1]] = numList.get(numList.size()-1);
			min = numList.get(numList.size()-1);
			
			for(int j=1; j<indexList.size(); j++) {
				index = indexList.get(j);
				
				matrix[index[0]][index[1]] = numList.get(j-1);
				min = Math.min(min, numList.get(j-1));
			}
			
			answer[i] = min;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
