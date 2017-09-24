package threads.thread;

/**
 * Created by gorod on 23.09.2017.
 */
public class MyThreadSecondExample extends Thread {

    public MyThreadSecondExample(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for (int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
