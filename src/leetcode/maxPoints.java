package leetcode;

public class maxPoints {
	public int solution(Point[] points) {

		int result = 0;
		if (points.length < 3) {
			result = points.length;
		} else {
			for (int i = 0; i < points.length; i++) {
				int x1 = points[i].x;
				int y1 = points[i].y;
				for (int j = i + 1; j < points.length; j++) {
					int x2 = points[j].x;
					int y2 = points[j].y;
					int count = 2;
					for (int k = 0; k < points.length; k++) {
						if (k != i && k != j) {
							int x = points[k].x;
							int y = points[k].y;
							if (x1 != x2 || y1 != y2) {
								if ((x - x1) * (y2 - y1) == (y - y1)
										* (x2 - x1)) {
									count++;
								}
							} else if (x1 == x2 && y1 == y2) {
								if (x1 == x && y1 == y) {
									count++;
								}
							}
						}
					}
					if (count > result) {
						result = count;
					}
				}
			}
		}
		return result;
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
