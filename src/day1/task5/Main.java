package day1.task5;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("WORLD");
        set.add("java");
        set.add("_learning");
        set.add("MY");
        set.add("hello");

        System.out.println("HashSet: ");
        for (String s : set) {
            System.out.println(s + " ");
        }

        System.out.println("\nTreeSet: ");
        TreeSet<String> set1 = ConvertHashSet.converHashSet(set);
        for (String s : set1) {
            System.out.println(s + " ");
        }
    }
}