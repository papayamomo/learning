package leetcode;

import java.util.HashMap;

public class maxPointsWRONG {
	public int solution(Point[] points) {
		HashMap<Integer, Integer> xMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> yMap = new HashMap<Integer, Integer>();

		int maxNumOfX = 0;
		for (Point point : points) {
			int key = point.x;
			if (xMap.containsKey(key)) {
				xMap.put(key, xMap.get(key) + 1);
			} else {
				xMap.put(key, 1);
			}
		}
		for (int key : xMap.keySet()) {
			if (xMap.get(key) > maxNumOfX) {
				maxNumOfX = xMap.get(key);
			}
		}

		int maxNumOfY = 0;
		for (Point point : points) {
			int key = point.y;
			if (yMap.containsKey(key)) {
				yMap.put(key, yMap.get(key) + 1);
			} else {
				yMap.put(key, 1);
			}
		}
		for (int key : yMap.keySet()) {
			if (yMap.get(key) > maxNumOfY) {
				maxNumOfY = yMap.get(key);
			}
		}

		int maxNum1 = maxNumOfX > maxNumOfY ? maxNumOfX : maxNumOfY;

		HashMap<Integer, Integer> xMap2 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> yMap2 = new HashMap<Integer, Integer>();

		int maxNumOfX2 = 0;
		for (Point point : points) {
			int key = point.x + point.y;
			if (xMap2.containsKey(key)) {
				xMap2.put(key, xMap2.get(key) + 1);
			} else {
				xMap2.put(key, 1);
			}
		}
		for (int key : xMap2.keySet()) {
			if (xMap2.get(key) > maxNumOfX2) {
				maxNumOfX2 = xMap2.get(key);
			}
		}

		int maxNumOfY2 = 0;
		for (Point point : points) {
			int key = point.x - point.y;
			if (yMap2.containsKey(key)) {
				yMap2.put(key, yMap2.get(key) + 1);
			} else {
				yMap2.put(key, 1);
			}
		}
		for (int key : yMap2.keySet()) {
			if (yMap2.get(key) > maxNumOfY2) {
				maxNumOfY2 = yMap2.get(key);
			}
		}

		int maxNum2 = maxNumOfX2 > maxNumOfY2 ? maxNumOfX2 : maxNumOfY2;

		return maxNum1 > maxNum2 ? maxNum1 : maxNum2;

	}

	class Point {
		int x;
		int y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

}
