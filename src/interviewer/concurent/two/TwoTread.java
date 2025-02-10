package interviewer.concurent.two;

/*
Напишите программу, которая создает два потока:
один выводит четные числа, а другой — нечетные.
 */

public class TwoTread {

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            for (int i = 0; i < 10; i+=2) {
                System.out.println("Even " + i);
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i < 10; i+=2) {
                System.out.println("Odd " + i);
            }
        });

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
