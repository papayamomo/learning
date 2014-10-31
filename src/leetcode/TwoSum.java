package leetcode;

public class TwoSum {

	public Pair solution(int[] array, int sum) {
		Pair pair = new Pair();

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					pair.index1 = i + 1;
					pair.index2 = j + 1;
					break;
				}
			}
		}
		return pair;
	}

	class Pair {
		int index1 = 0;
		int index2 = 0;

		@Override
		public String toString() {
			return "index1=" + index1 + "; index2=" + index2;

		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, 11, 15, 2, 7 };
		TwoSum solution = new TwoSum();
		System.out.println(solution.solution(array, 9));
	}
}
