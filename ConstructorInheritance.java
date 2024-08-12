class Base1 {

    Base1() {
        System.out.println("I am a constructor of Base1 class.");
    }

    Base1(int a) {
        System.out.println("I am a constructor of Base1 class with a integer value = " + a);
    }
}

class derrived1 extends Base1 {

    derrived1() {
        System.out.println("I am a constructor of derrived1 class.");
    }

    derrived1(int a,int b) {

       super(a);

        System.out.println("I am a constructor of derrived1 class with a integer value = " + b);
    }

}

class Child1 extends derrived1 {

    Child1() {
        System.out.println("I am a constructor of Child class.");
    }

    Child1(int a,int b,int c) {

        super(a,b);
        System.out.println("I am a constructor of Child class with a integer value = " + c);
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {

        // Base1 bb = new Base1(2);

        // derrived1 dd = new derrived1(5,6);

        Child1 cc = new Child1(6,8,12);

        System.out.println(cc.getClass());

    }
}
