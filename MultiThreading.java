class MyThread1 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
       
        while (true) {
            System.out.println("Thread 2");
        }
    }
}

class MyThread3 extends Thread {
    @Override
    public void run() {
       
        while (true) {
            System.out.println("Thread 3");
        }
    }
}

class MyThread4 extends Thread {
    @Override
    public void run() {
       
        while (true) {
            System.out.println("Thread 4");

        }
    }

    public class MultiThreading {
        public static void main(String[] args) {
            MyThread1 m1 = new MyThread1();
            MyThread2 m2 = new MyThread2();
            MyThread3 m3 = new MyThread3();
            MyThread4 m4 = new MyThread4();

            m1.setPriority(10);
            m1.start();
            m2.start();
            m3.start();
            m4.start();
        }
    }
}
