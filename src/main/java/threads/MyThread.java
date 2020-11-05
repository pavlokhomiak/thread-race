package threads;

import main.Counter;
import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger logger = Logger.getLogger(MyThread.class);

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        logger.info("MyThread " + Thread.currentThread().getName() + " is running");
        while (counter.getCount() < 100) {
            counter.increment();
            logger.info(Thread.currentThread().getName()
                    + ": counter = " + counter.getCount());
        }
        logger.info(Thread.currentThread().getName() + " stop running");
    }
}
