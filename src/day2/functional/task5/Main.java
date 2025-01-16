package day2.functional.task5;
/*
Создать параметризованный функциональный интерфейс (Generics)
На выходе получить:
1) Строку наоборот
2) Факториал числа
 */

public class Main {
    public static void main(String[] args) {
        MySupInterface<String> reverseString = (str) -> new StringBuilder(str).reverse().toString();
        System.out.println();
    }

    MySupInterface<Integer>  factorial = (n) -> {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    };


}
