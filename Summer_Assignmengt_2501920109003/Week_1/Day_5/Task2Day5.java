
public class Task2Day5 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Task2Day5 obj = new Task2Day5();

        obj.reverseString(s);

        for (char ch : s) {
            System.out.print(ch);
        }
    }
}
