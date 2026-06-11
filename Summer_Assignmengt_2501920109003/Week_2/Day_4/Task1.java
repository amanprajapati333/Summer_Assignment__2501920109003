package Week_2.Day_4;

public class Task1 {

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                int left = start;
                int right = i - 1;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        Task1 obj = new Task1();
        System.out.println(obj.reverseWords(s));

    }
}
