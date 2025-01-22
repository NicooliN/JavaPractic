package day3.collect.task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//анаграмма
//клоака - околка
//бейсбол - бобслей
public class Main {
    public static void main(String[] args) {
        System.out.println(isMapAnagram("клоака", "околка"));
        System.out.println(isMapAnagram("бейсбол", "бобслей"));

        System.out.println(isArrAnagram("клоака", "околка"));
        System.out.println(isArrAnagram("бейсбол", "бобслей"));

    }

    private static boolean isMapAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>();
        for (char c : s.toLowerCase().toCharArray()) {
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> mapT = new HashMap<>();
        for (char c : t.toLowerCase().toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        return mapS.equals(mapT);
    }

    private static boolean isArrAnagram(String s, String t) {
    return Arrays.equals(s.chars().sorted().toArray(), t.chars().sorted().toArray());
    }

}
