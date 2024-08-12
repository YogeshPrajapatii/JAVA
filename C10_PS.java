// Problem 1

import java.util.Scanner;

class Circle {

    public int radius;

    Circle(int r) {
        this.radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {

    private int height;

    Cylinder(int r, int h) {

        super(r);
        this.height = h;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }

}

// Problem 2

class Rectangle {

    public int height;
    public int width;

    Rectangle(int x, int y) {
        this.height = x;
        this.width = y;
    }

    int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }

    int area() {
        return height * width;
    }

}

class Cuboid extends Rectangle {

    public int length;

    Cuboid(int x, int y, int z) {

        super(x, y);
        this.length = z;
    }

    int getLength() {
        return length;
    }

    int area() {
        return 2 * (height * width + height * height + height * length);
    }

}

public class C10_PS {

    public static void main(String[] args) {

        // Problem 1

        /*
         * Circle objc = new Circle(2);
         * 
         * System.out.format("The area of circle is ="+objc.area() + "\n");
         * 
         * Cylinder obj2 = new Cylinder(1, 01);
         * System.out.println("The volume of cylinder is ="+obj2.volume());
         */

        // Problem 2

        /*
         * Rectangle rc = new Rectangle(12, 05);
         * 
         * System.out.println(rc.getHeight());
         * System.out.println(rc.area());
         * 
         * Cuboid cb = new Cuboid(12, 10, 10);
         * 
         * System.out.println(cb.length);
         * System.out.println(cb.area());
         */

        // if(187689438%2==0) System.out.println("Bazinga");

        // System.out.println(4<1);

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namste");
                break;

            case 3:
                System.out.println("Bonjour");

                break;

            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close();
    }
}