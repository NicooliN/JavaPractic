package day3.map;

import java.util.HashMap;
import java.util.Map;

/*Создайте карту, содержащую информацию о студентах и их оценках.
Каждая запись должна включать имя студента (ключ) и его оценку (значение).
Заполните карту несколькими записями и выведите её содержимое на экран. */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Andrey", 5);
        map.put("Paul", 3);
        map.put("Sasha", 8);

        map.forEach((name, grade) -> {
            System.out.println(name + " " + grade);
        });
    }
}
