package day1.task4;

import java.util.ArrayList;
import java.util.List;

/*
  Реализовать метод, который считает количество элементов в переданном List
  (элемент передается на вход, посчитать количество таких элементов в list)
 */
public class Main {
    public static void main(String[] args) {
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        System.out.println(ListUtils.countIf(list, true));
        System.out.println(ListUtils.countIf(list, false));

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("3");
        list2.add("3");
        list2.add("4");
        System.out.println(ListUtils.countIf(list2, "3"));

    }



}
