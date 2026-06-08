package Week_2.Day_1;

public class RansomNoteTask1 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            count[ransomNote.charAt(i) - 'a']--;

            if (count[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNoteTask1 obj = new RansomNoteTask1();

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(obj.canConstruct(ransomNote, magazine));
    }
}
