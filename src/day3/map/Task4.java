package day3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Дана карта, содержащая номера телефонов и имена владельцев.
Удалите из карты все записи, в которых номер телефона начинается с цифры '8'. */
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("+79161234567", "Иван");
        map.put("+79211234567", "Мария");
        map.put("+88121234567", "Сергей");
        map.put("+88001234567", "Анна");

        Map<String, String> filterMap = map.entrySet().stream()
                .filter(entry -> !entry.getKey().startsWith("+8"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        filterMap.forEach((num, name) -> {
            System.out.println(num + " " + name);
        });
    }

}
