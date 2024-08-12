abstract class Parent {

    abstract void sayHello();

    abstract void tellName();

}

class Child extends Parent {

    @Override

    void sayHello() {
        System.out.println("Hello");
    }

    @Override

    void tellName() {
        System.out.println("Hello sir my name is Child.");
    }
}

class Child2 extends Parent {
    @Override

    void sayHello() {
        System.out.println("Bonjour.");
    }

    @Override

    void tellName() {
        System.out.println("My name is Child 2.");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {

        Child ch = new Child();
        ch.sayHello();
        ch.tellName();

        Child2 cd = new Child2();
        cd.sayHello();
        cd.tellName();

    }
}
