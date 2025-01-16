package day2.stream.task3;
/*
Вывести количество повторений каждой строки и саму строку
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        List<String> names = List.of("Sam", "James", "Elena", "James", "Joe", "Sam", "James");

        //one
        Set<String> uniqueWords = new HashSet<>();
        for (String name : names) {
            System.out.println(name + " " + Collections.frequency(names, name));
        }

        //two
        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //three
        Map<String, Integer> map1 = names.parallelStream()
                .collect(Collectors.toConcurrentMap(key -> key, val -> 1, Integer::sum));
        System.out.println(map1);
    }

}
