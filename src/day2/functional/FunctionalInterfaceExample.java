package day2.functional;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello FunctionalInterface");
            }
        }).start();

        new Thread(() -> System.out.println("Hello FunctionalInterface")).start();
    }
}
//(parameter list) -> lambda body
//TODO: https://habr.com/ru/post/512730/ - Lambda-выражения в Java
//TODO: https://habr.com/ru/post/677610/ - Функциональные интерфейсы в Java 8
//TODO: https://habr.com/ru/post/437038/ - Перевод руководства по Stream API
//TODO: https://habr.com/ru/post/337350/ - Используйте Stream API проще
//TODO: https://highload.today/java-stream-api/ - Шпаргалка по STREAM/LAMBDA
