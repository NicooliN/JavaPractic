package day4.concurrency;

public class App {
    public static void main(String[] args) {
        System.out.println("MAin thread=" + getThredInfo());

    }

    private static String getThredInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

       return "Thread id = " + id + " Thread Name = " + name;
    }


}
