    class basic { // This is our base class we can not access objects of derrived class from base
              // class.

    private int x;

    public void setId(int x) {
        this.x = x;
    }

    public  int getId() {
        return x;
    }
}

class derrived extends basic { // This is our derrived class objects or methods of base class can be accessed
                               // from derrived class.
                               // This is called inheritance in java.

    String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class Inheritance {
    public static void main(String[] args) {

        derrived obj = new derrived();
        derrived obj2 = new derrived();

        obj.setId(125);
        System.out.println(obj.getId());

        obj2.setName("Yogesh Verma");
        System.out.println(obj2.getName());

    }

}
