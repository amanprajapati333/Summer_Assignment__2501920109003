package Week_1.Day_2;

public class FindMaxSubArrayTask3 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int nums[] = {1, 12, -5, -6, 50, 3};
        int k = 4;
        FindMaxSubArrayTask3 obj = new FindMaxSubArrayTask3();
        double result = obj.findMaxAverage(nums, k);
        System.out.println(result);
    }
}
