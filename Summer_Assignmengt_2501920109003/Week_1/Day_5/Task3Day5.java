
import java.util.*;

public class Task3Day5 {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < strs.length - 1) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Task3Day5 obj = new Task3Day5();
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
