package programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAnalysis {

	public static void main(String[] args) {
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int val_ext = 20300501;
		String sort_by = "remain";
		int[][] answer = {};
		String[] column = {"code", "date", "maximum", "remain"};
		int columnLength = column.length;
		Map<String, Integer> columnMap = new HashMap<>();
		List<int[]> dataList = new ArrayList<>();
		
		for(int i=0; i<columnLength; columnMap.put(column[i], i++));
		
		int extValue = columnMap.get(ext);
		int sortValue = columnMap.get(sort_by);
		
		for(int[] d : data) {
			if(d[extValue]<val_ext) {
				dataList.add(d);
			}
		}
		
		dataList.sort((a, b) -> a[sortValue] - b[sortValue]);
		
		System.out.println(Arrays.deepToString(dataList.toArray(answer)));
	}

}
