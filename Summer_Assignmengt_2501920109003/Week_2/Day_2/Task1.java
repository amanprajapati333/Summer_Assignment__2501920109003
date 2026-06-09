package Week_2.Day_2;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;
        int max_length = 0;

        List<Character> list = new ArrayList<>();

        while (end < s.length()) {

            char ch = s.charAt(end);

            if (!list.contains(ch)) {

                list.add(ch);

                max_length = Math.max(max_length, list.size());

                end++;
            } // Duplicate found
            else {

                list.remove(Character.valueOf(s.charAt(start)));

                start++;
            }
        }

        return max_length;
    }

    public static void main(String[] args) {

        Task1 obj = new Task1();

        String s = "abcabcbb";

        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
