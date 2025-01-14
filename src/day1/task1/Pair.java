package day1.task1;

public class Pair <T extends String, U extends Number>{

    T first;

    U second;

    public void print()  {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
