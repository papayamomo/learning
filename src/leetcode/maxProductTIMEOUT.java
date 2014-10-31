package leetcode;

public class maxProductTIMEOUT {

	public int solution(int[] num) {
		int maxProduct = num[0];
		int[] tmpNums = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			tmpNums[i] = num[i];
		}
		for (int gap = 1; gap < num.length; gap++) {
			for (int i = 0; i < num.length - gap; i++) {
				tmpNums[i] *= num[gap + i];
				if (tmpNums[i] > maxProduct) {
					maxProduct = tmpNums[i];
				}
			}
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 2, 3, -2, 4 };
		maxProductTIMEOUT solution = new maxProductTIMEOUT();
		System.out.println(solution.solution(array));
	}
}
