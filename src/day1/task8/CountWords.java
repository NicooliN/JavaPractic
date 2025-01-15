package day1.task8;

/*
На вход подается количество слов n и слова (каждое на отдельной строке).
(Scanner) - альтернатива - List<String>
Посчитать сколько раз встретилось каждое слово.
Вывести результат для каждого слова (в любом порядке).
Пример:
6
слон
слон
слон
кот
мышь
кот
кот
->
слон 2
кот 3
мышь 1
 */

import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
           list.add(scanner.next());
        }
        System.out.println(countWords(list));
    }

    public static Map<String, Integer> countWords(List<String> words) {
            Map<String, Integer> res = new HashMap<>();
            for (String value : words) {
                res.put(value, res.getOrDefault(value, 0) + 1);
            }
            return res;
    }
}
