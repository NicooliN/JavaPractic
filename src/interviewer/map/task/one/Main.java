package interviewer.map.task.one;

/*
Дан Map, содержащий строки как ключи и целые числа как значения.
Определите, содержит ли карта хотя бы одно повторяющееся значение.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 2);

        System.out.println(checkRepeat(map));


    }

    public static boolean checkRepeat(Map<String, Integer> map) {
        boolean result = false;
        Set<Integer> keys = new HashSet<>();
        for (Integer integer : map.values()) {
            if (!keys.add(integer)) result = true;
        }
       return result;
    }
}
