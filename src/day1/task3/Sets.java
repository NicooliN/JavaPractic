package day1.task3;

import java.util.HashSet;
import java.util.Set;

/*
 На вход подаются два сета, вывести уникальные элементы,
 которые встречаются и в первом и во втором.
 */
public class Sets {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);

        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(4);
        setTwo.add(5);
        setTwo.add(6);
        setTwo.add(2);
        setTwo.add(1);

        setOne.retainAll(setTwo);

        setOne.forEach(System.out::println);
    }
}
