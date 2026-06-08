package Week_2.Day_1;

public class ValidAnagramTask1 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagramTask1 obj = new ValidAnagramTask1();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t));

    }
}
