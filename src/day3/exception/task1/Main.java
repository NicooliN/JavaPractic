package day3.exception.task1;
/*
Создать собственное исключение MyCheckedException, являющееся проверяемым.
 */
public class Main {
    public static void main(String[] args) {
        try {
            method(1);
            method(0);
        }   catch (MyCheckedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method(int i) throws MyCheckedException{
        if (i == 0) {
            System.out.println("0");
        } else {
            throw new MyCheckedException("this bad zero");
        }
    }
}
