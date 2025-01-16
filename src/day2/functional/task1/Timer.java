package day2.functional.task1;

public class Timer {

    public long timeNanoSeconds = 0;

    public void measureTime(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        timeNanoSeconds = System.nanoTime() - startTime;
    }

}
