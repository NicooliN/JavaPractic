package day1.task2;

//теперь нам надо дополнить класс getters/setters
public class Pair<T extends String, U extends Number> {

   private T first;
   private U second;


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public void print()  {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
