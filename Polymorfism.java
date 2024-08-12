interface Airoplane {
    void meth1();
}

interface Ship {
    void meth2();
}

class Ok {
    void CallNumber(long Number) {
        System.out.println("Calling " + Number);
    }
}

class Example extends Ok implements Airoplane, Ship {
    public void meth1() {
        System.out.println("Calling meth1");
    }

    public void meth2() {
        System.out.println("Calling meth 2");
    }

    public void trying() {
        System.out.println("It's an example.");
    }
}

public class Polymorfism {
    public static void main(String[] args) {

        Airoplane ap = new Example();// Polymorphism me ham un methods ko hi use kar sakte h jiska reference liya gya
        // ap.meth2();// ho. Uske alawa koi method use nhi kar sakte h.

        ap.meth1();

        //Ship ip = new Ship(); --> We can't create objects for interfaces.
  
        Ship sp = new Example();
        sp.meth2();

        Example ex = new Example();
        ex.CallNumber(9999999999l);

    }
}