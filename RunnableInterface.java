/*class MyThread_Runnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 700) {
            System.out.println("1");
            i++;
        }
    }
}

class MyThread_Runnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 700) {
            System.out.println("2");
            i++;
        }
    }
}

class MyThread_Runnable3 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 700) {
            System.out.println("3");
            i++;
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {

        MyThread_Runnable1 bullet1 = new MyThread_Runnable1();
        Thread gun1 = new Thread(bullet1);

        MyThread_Runnable2 bullet2 = new MyThread_Runnable2();
        Thread gun2 = new Thread(bullet2);

        MyThread_Runnable3 bullet3 = new MyThread_Runnable3();
        Thread gun3 = new Thread(bullet3);

        gun1.start();
        gun2.start();
        gun3.start();

    }
}*/
