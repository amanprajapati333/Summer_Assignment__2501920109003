//1. Two Sum

import java.util.Arrays;

public class Task1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        Task1 obj = new Task1();
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
