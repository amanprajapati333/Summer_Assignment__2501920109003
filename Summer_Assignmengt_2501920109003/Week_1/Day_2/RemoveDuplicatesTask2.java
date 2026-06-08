package Week_1.Day_2;

import java.util.HashSet;

public class RemoveDuplicatesTask2 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        RemoveDuplicatesTask2 obj = new RemoveDuplicatesTask2();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}
