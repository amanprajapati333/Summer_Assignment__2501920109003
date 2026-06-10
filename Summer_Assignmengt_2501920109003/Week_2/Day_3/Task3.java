package Week_2.Day_3;

public class Task3 {

    static class Solution {

        public boolean repeatedSubstringPattern(String s) {

            int n = s.length();

            for (int len = 1; len <= n / 2; len++) {

                if (n % len == 0) {

                    String sub = s.substring(0, len);
                    StringBuilder sb = new StringBuilder();

                    int repeat = n / len;

                    for (int i = 0; i < repeat; i++) {
                        sb.append(sub);
                    }

                    if (sb.toString().equals(s)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.repeatedSubstringPattern("abab")); // true
        System.out.println(obj.repeatedSubstringPattern("aba"));  // false
        System.out.println(obj.repeatedSubstringPattern("abcabcabc")); // true
    }
}
