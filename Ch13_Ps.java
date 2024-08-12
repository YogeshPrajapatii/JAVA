class X1 extends Thread {
    @Override
    public void run() {
        // int i = 1;
        // while (i < 100) {
        //     try {
        //         Thread.sleep(200);
        //     } catch (Exception e) {
        //         System.out.println(e);// TODO: handle exception
        int i = 1;
        while (i < 100) {
            System.out.println("Good Monrning.");
             i++;
        }
        //     }
            
        }
    }


class X2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);// TODO: handle exception
            }
            System.out.println("Welcome.");
            i++;
        }

    }
}

public class Ch13_Ps {
    public static void main(String[] args) {
        X1 x1 = new X1();
        X2 x2 = new X2();
        x1.setPriority(1);
        x1.start();

        x2.start();
        x2.setPriority(10);
        

        System.out.println(x1.getPriority());
       // System.out.println(x1.getState());
        System.out.println(x2.getPriority());
        //System.out.println(x2.getState());

        System.out.println(Thread.currentThread().getState());
    }
}
