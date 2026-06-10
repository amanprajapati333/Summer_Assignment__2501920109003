package Week_2.Day_3;

public class Task1 {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Task1 obj = new Task1();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(obj.strStr(haystack, needle));
    }
}
