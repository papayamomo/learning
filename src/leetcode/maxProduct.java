package leetcode;

public class maxProduct {

	public int solution(int[] num) {
		int min_temp = num[0];
		int max_temp = num[0];
		int result = num[0];

		for (int i = 1; i < num.length; i++) {
			int a = max_temp * num[i];
			int b = min_temp * num[i];
			int c = num[i];
			max_temp = Math.max(Math.max(a, b), c);
			min_temp = Math.min(Math.min(a, b), c);
			result = max_temp > result ? max_temp : result;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[] { -3, -4 };
		// int[] array = new int[] { 8, -1, -2, 3, -2, 4, 9 };
		maxProduct solution = new maxProduct();
		System.out.println(solution.solution(array));
	}
}
