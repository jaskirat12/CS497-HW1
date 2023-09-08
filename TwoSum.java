package main;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3, 3};
		int target = 6;
		int[] output = twoSum(nums, target);
		if(output[0] != output[1]) {
		System.out.println("["+output[0]+", "+output[1]+']');
		}
		else {
			System.out.println("No Solution");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for (int j=1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					int[] output = {i, j};
					return output;
				}
			}
		}
		int[] output = {0, 0};
		return output;
	} 

}
