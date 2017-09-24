package threads.runnable;

/**
 * Created by gorod on 23.09.2017.
 */
public class UseThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        MyThreadFirstExample mt = new MyThreadFirstExample("Child #1");

        for (int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interruped.");
            }
        }

        System.out.println("Main thread ending.");
    }
}
