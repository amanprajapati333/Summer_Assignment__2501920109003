package Week_1.Day_3;

public class MoveZeroTask1 {

    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 3, 12};

        MoveZeroTask1 obj = new MoveZeroTask1();
        obj.moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
