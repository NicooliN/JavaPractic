package day4.concurrency.one;

public class MyThreadApp extends Thread {
    public void run() {
        System.out.println("MyThread finish =" + getThreadInfo());

        while (!isInterrupted()) {
            System.out.println("tread run");
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("thread state= " + Thread.currentThread().getState());
                break;
            }
        }

        System.out.println("thread state: " + Thread.currentThread().getState());
   // System.out.println("MyThread finish =" + getThreadInfo());
       // System.out.println("thread state: " + Thread.currentThread().getState());
    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread{id = " + id + "; Name = " + name + "}";
    }
}
