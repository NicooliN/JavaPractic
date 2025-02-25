package day4.concurrency.one;

public class MyThreadApp extends Thread {
    public void run() {
        System.out.println("MyThread finish =" + getThreadInfo());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread state: " + Thread.currentThread().getState());
    System.out.println("MyThread finish =" + getThreadInfo());
        System.out.println("thread state: " + Thread.currentThread().getState());
    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread{id = " + id + "; Name = " + name + "}";
    }
}
