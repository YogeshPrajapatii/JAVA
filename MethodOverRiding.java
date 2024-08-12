class A {

    public int z() {
        return 5;
    }

    public void X() {

        System.out.println("I am method of class A");

    }
}

class B extends A {

    @Override
    public void X() {

        System.out.println("I am method of class B");

    }
}

public class MethodOverRiding {
    public static void main(String[] args) {

        A sc = new A();
        sc.X();
        System.out.println(sc.z());

        B bb = new B();
        bb.X();

    }
}
