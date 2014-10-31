package leetcode;

import java.util.Stack;

public class evalRPN {

	public int solution(String[] array) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String element : array) {
			if (element.equals("+")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first + second);
			} else if (element.equals("-")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first - second);
			} else if (element.equals("*")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first * second);
			} else if (element.equals("/")) {
				int second = stack.pop();
				int first = stack.pop();
				stack.push(first / second);
			} else {
				stack.push(Integer.parseInt(element));
			}
		}

		int result = 0;
		if (!stack.isEmpty()) {
			result = stack.pop();
		}
		return result;
	}

	public static void main(String[] args) {
		String[] array = new String[] { "4", "13", "5", "/", "+" };
		evalRPN solution = new evalRPN();
		System.out.println(solution.solution(array));
	}

}
