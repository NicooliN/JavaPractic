package day1.task6;
/*
Задача с собеседований:
На вход подается строка, состоящая из маленьких латинских символов.
Проверить, что в строке встречаются все символы английского алфавита хотя бы раз:
thequickbrownfoxjumpsoverthelazydog -> true
sdfaaaa -> false
 */


import java.util.Set;
import java.util.TreeSet;

public class StringCheck {

    public static void main(String[] args) {

        System.out.println(checkString("qwertyuiopasdfghjklzxcvbnmeee"));
        System.out.println(checkString("qweadfartyuiop"));
    }

    public static boolean checkString(String s) {
        if(s.length() < 26) {
            return false;
        }
        Set<Character> set = new TreeSet<>();
        for(char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
