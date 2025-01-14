package day1.task1;
/*
Создать класс Pair, который умеет хранить два значения:
первое - только строка, второе - только число.
 */

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.first = "Test first";
        pair.second = 123;
        pair.print();

        Pair<String, Double> pair2 = new Pair<>();
        pair2.first = "Test pair2";
        pair2.second = 123.456;
        pair2.print();
    }
}
