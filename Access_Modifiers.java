class modifier {

    private float radius, area, circumference;

    public void setRadius(float r) {
        radius = r;
    }

    public float getRadius() {
        System.out.print("The radius of this cirle is = ");
        return radius;
    }

    public void setArea(float a) {
        if (a == 3.14f * radius * radius) {
            System.out.print("The area of this circle is = ");
            area = a;
        } else {
            System.out.print("Error! This area is incorrect ");
        }
    }

    public float getArea() {
        return area;
    }

    public void setcircumference(float c) {
        if (c == 2 * 3.14f * radius) {
            System.out.print("The circumference of this circle is = ");
            circumference = c;
        }

        else {
            System.out.print("Error! This circumference is incorrect ");
        }

    }

    public float getcircumfernce() {

        return circumference;
    }

}

public class Access_Modifiers {
    public static void main(String[] args) {

        modifier cr = new modifier();

        cr.setRadius(1);
        System.out.println(cr.getRadius() + " cm");

        System.out.println();

        cr.setArea(3.14f);
        System.out.println(cr.getArea() + " square unit");

        System.out.println();

        cr.setcircumference(6.28f);
        System.out.println(cr.getcircumfernce() + " cm");
        
        System.out.println();
    }
}
