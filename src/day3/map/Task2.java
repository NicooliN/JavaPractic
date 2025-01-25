package day3.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*Дана карта, содержащая имена студентов и их оценки.
Найдите студента с максимальной оценкой и выведите его имя и оценку. */
public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Andrey", 5);
        map.put("Paul", 9);
        map.put("Sasha", 8);

        int maxGrade = 0;
        String nameS;
        map.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .ifPresent(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

//        String maxStudent = "";
//        int maxGrade = 0;
//
//        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
//            if (entry.getValue() > maxGrade) {
//                maxGrade = entry.getValue();
//                maxStudent = entry.getKey();
//            }
//        }
    }
}
