package day4.concurrency.one;

import day4.concurrency.MyThread;

public class AppCon {

    public static void main(String[] args) throws InterruptedException {


        MyThreadApp myThread = new MyThreadApp();
        System.out.println("thread state: " + myThread.getState());


        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();

        System.out.println("thread state: " + myThread.getState());

    }

    private static String getThreadInfo() {
        Thread thread =Thread.currentThread();
        long id = thread.getId();
        String name = thread.getName();

        return "Thread{id = " + id + "; Name = " + name + "}";
    }


}
