// Problem 1
/*abstract class Pen {
    abstract void write();

    abstract void refill();
}

class BallPen extends Pen {
    public void write() {
        System.out.println("Writing Code...");
    }

    public void refill() {
        System.out.println("Refill the Pen.");
    }

    public void changeNib() {
        System.out.println("Change the Nib.");
    }
}*/

// Problem 2
interface BasicAnimal {
    abstract void eat();

    abstract void sleep();
}

class Monkey {
    void jump() {
        System.out.println("Monkey jums on trees.");
    }

    void bite() {
        System.out.println("Monkey can bite also.");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Human eats food");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }

}

// Problem 3

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconected();
}

class SmartTelephone extends Telephone {
    public void ring() {
        System.out.println("Ringing...");
    };

    public void lift() {
        System.out.println("Lifted");
    };

    public void disconected() {
        System.out.println("Disconnected.");
    }

    public void myMethod() {
        System.out.println("It's my Method.");
    }
}

// Problem 4

interface SmartTvRemote {
    void meth1();
}

interface TvRemote extends SmartTvRemote {// An interface can also extend another interface.
    void meth2();
}

class Tv implements TvRemote {

    public void meth1() {
        System.out.println("Meth 1");
    }

    public void meth2() {
        System.out.println("Meth 2");
    }
}

public class CH_11_PS {
    public static void main(String[] args) {

        // Q 1
        /*
         * BallPen bp = new BallPen();
         * 
         * bp.changeNib();
         */

        // Q 2 + Q 3
        /*
         * Human sm = new Human();
         * sm.sleep();
         * 
         * Monkey mo = new Human();
         * mo.jump();
         * 
         * BasicAnimal ba = new Human(); // We can use reffrence of interfaces.
         * ba.eat();
         */

        // Q 3

        Telephone tt = new SmartTelephone();
        // tt.myMethod(); --> can't use method beyond the range of reffernce.
        tt.disconected();

        // Q 4

        TvRemote tv = new Tv();
        tv.meth1();
        tv.meth2();

    }
}
