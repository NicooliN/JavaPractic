package day3.collect.task1;

import java.util.*;

/*
Реализовать метод, который на вход принимает ArrayList<T>,
а возвращает набор уникальных элементов этого массива. Решить используя коллекции.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 1,7, 8,2, 9, 10);
        convert(list);
    }

    public static <T> Set<T> convert(List<T> from) {
        return new HashSet<T>(from);
    }

}
