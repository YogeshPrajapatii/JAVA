class Aa implements Runnable {
    @Override

    public void run() {
        int i = 0;
        while (i < 1001) {

            System.out.println("The tread 1 is running.");
            i++;
        }
    }
}

class A2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 2 is running.");
            i++;
        }
    }
}

class A3 extends Thread {
    @Override
    public void run() {
        int i = 10;
        while (i >1) {
            System.out.println("Thread 3 is running.");
            i--;
        }
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {

        Aa runnable = new Aa();
        Thread thread = new Thread(runnable, "Yogesh");

        // thread.start();
        // System.out.println(thread.getName());
        // System.out.println(thread.getPriority());
        // System.out.println(thread.getClass());

        A2 a2 = new A2();
        // a2.start();
        // System.out.println(a2.getName());
        // System.out.println(a2.hashCode());
        // System.out.println(a2.getPriority());
        // System.out.println(a2.isAlive());
        // System.out.println(a2.isDaemon());
        // System.out.println(a2.threadId());
        // System.out.println(a2.getState());
        // System.out.println(a2.isVirtual());
        // System.out.println(a2.activeCount());

        A3 a3 = new A3();
        a3.start();

    }
}
