package Week_2.Day_3;

public class Task2 {

    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        Task2 obj = new Task2();

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(obj.isSubsequence(s, t));
    }
}
