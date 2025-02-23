package day4.concurrency;

public class App {
    public static void main(String[] args) throws InterruptedException {


        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        System.out.println("Main thread = " + getThreadInfo());
    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

       return "Thread{id = " + id + "; Name = " + name + "}";
    }


}
