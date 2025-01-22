package day3.exception.task2;
/*
 * Создать класс MyEvenNumber, который хранит четное число int n. Используя
 * исключения, запретить создание инстанса с нечетным числом.
 */

public class Main {
    public static void main(String[] args) {
        MyEvenNumber evenNumber = new MyEvenNumber(4);
        MyEvenNumber evenNumber2 = new MyEvenNumber(5);
    }
}
