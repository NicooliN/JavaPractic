package day1.task2;
/*
Создать класс Pair, который умеет хранить два значения:
первое - только строка, второе - только число.
 */

import day1.task2.Pair;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();
        pair.setFirst("Test String");
        pair.setSecond(Integer.parseInt("123"));
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
