package day2.stream.task2;
/*
Проверить, является ли текст палиндром.
Из исходной строки с помощью стримов убрать все символы,
не являющиеся цифрой или буквой, привести к нижнему регистру.
 */

public class Polindrome {
    public static void main(String[] args) {
        System.out.println(isPolindrome("aB121ba"));
    }

    public static boolean isPolindrome(String str) {
        StringBuilder leftToRigth = new StringBuilder();
        str.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRigth::appendCodePoint);

        StringBuilder rightToLeft = new StringBuilder(leftToRigth).reverse();
        return leftToRigth.toString().equals(rightToLeft.toString());
    }
}
