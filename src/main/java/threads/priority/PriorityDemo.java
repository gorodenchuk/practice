package threads.priority;

import threads.runnable.MyThreadFirstExample;

/**
 * Created by gorod on 23.09.2017.
 */
public class PriorityDemo {
    public static void main(String args[]) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt1.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interruped.");
        }
        System.out.println("\nHigh priority thread counted to " + mt1.count);
        System.out.println("\nLow priority thread counted to " + mt2.count);
    }
}

