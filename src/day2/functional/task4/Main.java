package day2.functional.task4;
/*
реализовать метод, чтобы вывести строку наоборот, используя наш ReverseInterface
 */
public class Main {
    public static void main(String[] args) {
        ReverseInterface reverseInterface = (str) -> new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(reverseInterface.reverse("Lambda"));


    }
}
