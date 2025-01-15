package day1.task5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Создать метод, переводящий из HashSet в TreeSet. Вывести оба варианта.
Про деревья:
 https://habr.com/ru/post/330644/

Структуры данных в картинках:
  https://habr.com/ru/post/128017/
 */
public class ConvertHashSet {
    private ConvertHashSet(){}

    public static <T>TreeSet<T> converHashSet(HashSet<T> src){

        TreeSet<T> res = new TreeSet<>();
        for(T t : src){
            res.add(t);
        }
        return res;
        //return new TreeSet<>(src);
    }
}
