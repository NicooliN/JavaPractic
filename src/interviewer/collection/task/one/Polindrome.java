package interviewer.collection.task.one;
/*
Полиндром используя только массивы
 */
public class Polindrome {

    public static void main(String[] args) {
        System.out.println(isPolindrome("adssda"));
        System.out.println(isPolindrome("a"));
        System.out.println(isPolindrome("ab"));
    }

    public static boolean isPolindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
