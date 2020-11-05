package threads;

import main.Counter;
import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyRunnable.class);
    private static final int MAX_INT = 100;

    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        logger.info("MyRunnable " + Thread.currentThread().getName()
                + " is running");
        while (counter.getCount() < MAX_INT) {
            counter.increment();
            logger.info(Thread.currentThread().getName()
                    + ": counter = " + counter.getCount());
        }
        logger.info(Thread.currentThread().getName() + " stop running");
    }
}
