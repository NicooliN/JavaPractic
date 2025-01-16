package day2.stream.task1;

/*
Использовать реализованный функциональный интерфейс Square на списке чисел, вывести на экран
 */

import day2.functional.task2.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(24);

        Square s = (x) -> x * x;

        list.stream()
                .map(s::square)
                .forEach(System.out::println);
    }
}
