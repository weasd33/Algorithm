package Programmers;

import java.util.HashMap;

public class No53 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		System.out.println(map);
	}
}
