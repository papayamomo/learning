package leetcode;

import java.util.HashSet;
import java.util.Set;

public class wordBreak {

	public boolean solution(String s, Set<String> dict) {
		boolean inDict = false;
		int start = 0;
		int end = 0;
		while (end < s.length() + 1) {
			for (int i = start + 1; i < s.length() + 1; i++) {
				String piece = s.substring(start, end);
				if (dict.contains(piece)) {

				}
			}
		}
		// for (int i = 1; i < s.length() + 1; i++) {
		// String firstHalf = s.substring(0, i);
		// if (firstHalf != null && dict.contains(firstHalf)) {
		// String secondHalf = s.substring(i);
		// if ((secondHalf != null && dict.contains(secondHalf))
		// || (secondHalf != null && secondHalf.equals(""))) {
		// inDict = true;
		// break;
		// }
		// }
		// }
		return inDict;
	}

	public static void main(String[] args) {
		String str = "abcd";
		Set<String> dict = new HashSet<String>();
		dict.add("a");
		dict.add("abc");
		dict.add("b");
		dict.add("cd");
		wordBreak solution = new wordBreak();
		System.out.println(solution.solution(str, dict));

	}
}
