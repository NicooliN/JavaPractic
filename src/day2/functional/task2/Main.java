package day2.functional.task2;
/*
Задача 2
С помощью функционального интерфейса выполнить подсчет квадрата числа
 */
public class Main {
    public static void main(String[] args) {
        Square s = new Square() {
            @Override
            public int square(int x) {
                return x * x;
            }
        };
        System.out.println(s.square(2));

        Square s1 = (int x) -> x * x;
        System.out.println(s1.square(2));
    }
}
