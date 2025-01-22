package day3.exception.task2;

public class MyEvenNumber {
    private int number;

    public MyEvenNumber(int number) {
        if (number % 2 == 0) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Wrong number");
        }
    }
}
