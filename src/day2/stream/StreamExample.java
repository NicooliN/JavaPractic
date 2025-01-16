package day2.stream;

import java.util.List;

public class StreamExample {
//cspf
    public static void main(String[] args) {
        List<String> myPlaces = List.of("Nepal, Kathmandu", "Nepal, Pokhara", "India, Delhi", "USA, New York", "Africa, Nigeria");
        myPlaces.stream()
                .filter(place -> place.startsWith("Nepal"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
