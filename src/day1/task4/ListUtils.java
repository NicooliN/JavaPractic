package day1.task4;

import java.util.List;

public class ListUtils {

    private ListUtils() {}

    public static <T> int countIf(List<T> list, T element){
        int count = 0;
        for(T t : list){
            if(t.equals(element)){
                count++;
            }
        }
        return count;
    }
}
