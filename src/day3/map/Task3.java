package day3.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Дана карта, содержащая имена сотрудников и их зарплаты.
Увеличьте зарплату каждого сотрудника на 10% и выведите обновленную карту. */
public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Andrey", 5000);
        map.put("Paul", 9000);
        map.put("Sasha", 8000);

//        for (Map.Entry<String, Integer> entry: map.entrySet()) {
//            entry.setValue(entry.getValue() + (entry.getValue() / 10));
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        map.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.setValue(entry.getValue() * 2)));

        map.forEach((name, grade) ->
            System.out.println(name + " " + grade)
        );
    }

}
