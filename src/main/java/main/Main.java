package main;

import org.apache.log4j.Logger;
import threads.MyRunnable;
import threads.MyThread;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Main thread " + Thread.currentThread().getName()
                + " is running");
        Counter counter = new Counter(0);
        Thread myThread = new MyThread(counter);
        Runnable myRunnable = new MyRunnable(counter);
        Thread myRunnableThread = new Thread(myRunnable);

        myThread.start();
        myRunnableThread.start();
    }
}
