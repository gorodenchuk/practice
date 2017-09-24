package threads.runnable;

/**
 * Created by gorod on 23.09.2017.
 */
public class JoinThreads {

        public static void main(String args[]) {
            System.out.println("Main thread starting.");

            MyThreadFirstExample mt1 = new MyThreadFirstExample("Child #1");
            MyThreadFirstExample mt2 = new MyThreadFirstExample("Child #2");
            MyThreadFirstExample mt3 = new MyThreadFirstExample("Child #3");
            MyThreadFirstExample mt4 = new MyThreadFirstExample("Child #4");

                try {
                    mt1.thrd.join();
                    System.out.println("Child #1 joined");
                    mt2.thrd.join();
                    System.out.println("Child #2 joined");
                    mt3.thrd.join();
                    System.out.println("Child #3 joined");
                    mt4.thrd.join();
                    System.out.println("Child #4 joined");
                }
                catch (InterruptedException exc) {
                    System.out.println("Main thread interruped.");
                }
            System.out.println("Main thread ending.");
        }

}
