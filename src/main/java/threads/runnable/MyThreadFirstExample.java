package threads.runnable;

/**
 * Created by gorod on 23.09.2017.
 */
public class MyThreadFirstExample implements Runnable {
    Thread thrd;

    public MyThreadFirstExample(String name) {
        this.thrd = new Thread(this, name);
        this.thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for (int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
