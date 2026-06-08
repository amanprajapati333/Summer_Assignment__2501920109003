
public class PlaindromeTask5 {

    public Boolean palindrome(int num) {

        int rev = 0;
        int temp = num;
        if (num < 0) {
            return false;
        }
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        return rev == temp;

    }

    public static void main(String[] args) {
        int num = 121;
        PlaindromeTask5 obj = new PlaindromeTask5();

        System.out.println(obj.palindrome(num));

    }
}
