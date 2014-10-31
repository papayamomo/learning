package leetcode;

import java.util.HashMap;
import java.util.Map;

//every element appears three times except for one

public class singleNumber {

	public int solution(int[] A) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int output = 0;
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) != 3) {
				output = key;
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] A = new int[4];
		for (int i = 0; i < 3; i++) {
			A[i] = 1;
		}
		A[3] = 2;

		singleNumber solution = new singleNumber();
		System.out.println(solution.solution(A));
	}
}
