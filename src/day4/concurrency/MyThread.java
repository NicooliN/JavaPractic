package day4.concurrency;

public class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread=" + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread{id = " + id + "; Name = " + name + "}";
    }
}
