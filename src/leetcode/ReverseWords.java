package leetcode;

public class ReverseWords {

	public String solution(String s) {
		if (s == null)
			return null;

		String output = "";
		String[] pieces = s.split(" ");
		for (int i = pieces.length - 1; i >= 0; i--) {
			output += pieces[i] + " ";
		}
		output = output.replaceAll(" +", " ");
		return output.trim();
	}

	public static void main(String[] args) {
		String input = "the   sky   is   blue";
		ReverseWords solution = new ReverseWords();
		System.out.println(solution.solution(input));
	}
}
