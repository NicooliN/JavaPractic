package day1.task7;

/*
Простая задача: сохранить в мапе три элемента (1, “first”).
Вывести элемент значение по ключу 2
 */

import java.util.HashMap;
import java.util.Map;

public class MapSave {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println("MAP ELEMENTS: " + map);
        System.out.println("key 2: " + map.get(2));
    }
}
