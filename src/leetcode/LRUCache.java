package leetcode;

import java.util.LinkedHashMap;

public class LRUCache {

	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	int capacity = 0;
	int counter = 0;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			int value = map.get(key);
			map.remove(key);
			map.put(key, value);
			return map.get(key);
		}

		return -1;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			map.remove(key);
			map.put(key, value);
		} else {
			if (counter < capacity) {
				map.put(key, value);
				counter++;
			} else {
				for (int key1 : map.keySet()) {
					map.remove(key1);
					break;
				}
				map.put(key, value);
			}
		}
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.set(2, 6);
		cache.set(1, 5);
		cache.set(1, 2);
		System.out.println(cache.get(2));
	}

}
