package day2.functional.task1;
/*
Задача 1
Создать таймер, который считает время выполнения метода, используя Runnable и лямда выражение.
 */
public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.measureTime(new SimpleSummator());
        System.out.println(timer.timeNanoSeconds);


        Timer lambdaTimer = new Timer();
        lambdaTimer.measureTime(() -> {
            long sum = 0;
            for (long i = 1; i <= 1_000_000_000 ; i++) {
                sum++;
            }
            System.out.println(sum);
        });
        System.out.println(lambdaTimer.timeNanoSeconds);
    }
}
