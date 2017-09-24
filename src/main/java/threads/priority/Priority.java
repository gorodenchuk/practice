package threads.priority;

/**
 * Created by gorod on 24.09.2017.
 */
class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        this.thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;

        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}
