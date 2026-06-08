package Week_2.Day_1;

public class firstuniqueCharTask2 {

    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        firstuniqueCharTask2 obj = new firstuniqueCharTask2();
        String s = "leetcode";
        System.out.println(obj.firstUniqChar(s));
    }
}
