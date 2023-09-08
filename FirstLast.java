package main;

public class FirstLast {

	public static void main(String[] args) {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 6;
		int[] output = firstLast(nums, target, 0, nums.length - 1);
		System.out.println("["+output[0]+", "+output[1]+']');
	}

	public static int[] firstLast(int[] nums, int target, int start, int end) {
		int mid = start + end/ 2;
		if(nums.length == 0) {
			int[] output = {-1, -1};
			return output;
		}
		else if(nums[mid] < target && mid != start) {
			int[] output = firstLast(nums, target, mid, end);
			return output;
		}
		else if(nums[mid] > target && mid != end) {
			int[] output = firstLast(nums, target, start, mid);
			return output;
		}
		else if(nums[mid] == target) {
			int[] output = new int[2];
			int i = mid;
			do {
				i--;
			}while(nums[i] == target);
			i++;
			output[0] = i;
			i = mid;
			do {
				i++;
			}while(nums[i] == target);
			i--;
			output[1] = i;
			return output;
		}
		else {
			int[] output = {-1, -1};
			return output;
		}
	}
}
