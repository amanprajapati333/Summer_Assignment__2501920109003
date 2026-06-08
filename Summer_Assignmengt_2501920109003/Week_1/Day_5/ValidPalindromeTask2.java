
public class ValidPalindromeTask2 {

    public boolean validPalidrome(String name) {
        name = name.toLowerCase();
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        if (name.equals(rev)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String name = "Madam";
        ValidPalindromeTask2 obj = new ValidPalindromeTask2();
        System.out.println(obj.validPalidrome(name));

    }

}
