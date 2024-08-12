class base {
    private int id;
    private String name;

    // Constructor
    public base() {
        id = 151;
        name = "Your_Name_Here";
    }

    // Constructor Overloading

    public base(String nam, int myid) {
        id = myid;
        name = nam;
    }

    public base(int vg) {
        id = vg;
        name = "Your_Name_Here";
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class Constructors {
    public static void main(String[] args) {

        base yv = new base(100);

        System.out.println(yv.getName());
        System.out.println(yv.getid());

    }
}
