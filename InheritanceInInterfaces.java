interface SampleInterface {
    void meth1();
}

interface ChildInterface extends SampleInterface { // An interface can also extend another interface.
    void meth2();
}

class MySampleClass implements ChildInterface {
    public void meth1() {
        System.out.println("Method 1");
    }

    public void meth2() {
        System.out.println("Method 2");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {

        MySampleClass ms = new MySampleClass();

        ms.meth1();
        ms.meth2();

    }
}
