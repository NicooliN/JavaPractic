package interviewer.collection.task.two;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
Написать программу, которая принимает строку и возвращает новую строку с удаленными повторяющимися символами.
 */
public class Uniq {
    public static void main(String[] args) {
        System.out.println(uniqSimbol("aaabbcdeee"));
        System.out.println(stremUniqSimbol("aaabbcdeee"));
    }

    public static String uniqSimbol(String str) {
       StringBuilder sb = new StringBuilder();

       for (int i = 0; i < str.length(); i++) {
           if(sb.indexOf(String.valueOf(str.charAt(i))) == -1) {
               sb.append(str.charAt(i));
           }
       }

        return sb.toString();
    }

    public static String stremUniqSimbol(String str) {
        return str.chars()
                .distinct()
                .mapToObj(i -> String.valueOf((char)i))
                .collect(Collectors.joining());
    }
}
