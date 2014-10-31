package leetcode;

public class FindMin {

	public int solution(int[] num) {
		int output = num[0];
		for (int item : num) {
			if (item < output)
				output = item;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 6, 7, 8, 1, 2 };
		FindMin solution = new FindMin();
		System.out.println(solution.solution(array));
	}
}
