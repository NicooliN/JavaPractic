package day4.concurrency;

public class App {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Task thread = " + getThreadInfo());
        };

        Thread thread = new Thread(task);
        thread.start();

        thread = new Thread(task);
        thread.start();

        System.out.println("Main thread = " + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

       return "Thread{id = " + id + "; Name = " + name + "}";
    }


}
