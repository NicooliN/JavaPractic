package day2.functional.task3;
/*
получить значение PI через собственный функциональный интерфейс
 */
public class Main {
    public static void main(String[] args) {
        MyPi pi = () ->  Math.PI;

        MyPi simplePi = () -> 3.1415;

        System.out.println(pi.getPiValue());
        System.out.println(simplePi.getPiValue());
    }
}
