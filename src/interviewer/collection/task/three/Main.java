package interviewer.collection.task.three;
/*

Напишите программу, которая выполняет следующие действия:
Создайте список строк.
Добавьте в него несколько элементов.
Удалите все элементы, содержащие определенную подстроку.
Отсортируйте оставшиеся элементы по длине строки.
Выведите результат на экран.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        list.add("cherry");

        list.removeIf(s -> s.contains("an"));
        Collections.sort(list, (x1, x2) -> Integer.compare(x1.length(), x2.length()));
        System.out.println(list);
    }
}
