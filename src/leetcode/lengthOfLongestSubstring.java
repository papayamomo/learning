package leetcode;

import java.util.HashMap;

public class lengthOfLongestSubstring {

	public int solution(String input) {
		int pre = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {
			if (!map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), i);
			} else {
				pre = Math.max(pre, map.size());
				i = map.get(input.charAt(i));
				map.clear();
			}
		}

		return Math.max(pre, map.size());
	}

	public static void main(String[] args) {
		String input = "abcabdcefg";
		lengthOfLongestSubstring solution = new lengthOfLongestSubstring();
		System.out.println(solution.solution(input));
	}
}
