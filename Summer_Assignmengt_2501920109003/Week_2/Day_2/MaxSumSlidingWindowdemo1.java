package Week_2.Day_2;

class MaxSumSlidingWindowdemo1 {

    public static int maxxSum(int[] nums, int k) {

        int current = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        int maxSum = current;

        // Sliding the window
        for (int i = k; i < nums.length; i++) {

            current = current + nums[i] - nums[i - k];

            if (current > maxSum) {
                maxSum = current;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {3, 8, 2, 5, 7, 6, 12};

        int k = 3;

        System.out.println("Maximum Sum = " + maxxSum(nums, k));
    }
}
