package programmers_Lv2;

public class TargetNumber {
//	https://school.programmers.co.kr/learn/courses/30/lessons/43165
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;

		System.out.println(dfs(numbers, 0, 0, target));
	}

	public static int dfs(int[] numbers, int num, int index, int target) {
		if(index==numbers.length) {
			return num==target ? 1 : 0;
		}
		
		return dfs(numbers, num + numbers[index], index + 1, target) + dfs(numbers, num - numbers[index], index + 1, target);
	}
}
