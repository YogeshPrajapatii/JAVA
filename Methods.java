public class Methods {

    static int logic(int x, int y) {

        int z;

        z = x + y;

        return z;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c;

        c = logic(a, b);

        int a1 = 20;
        int b1 = 50;
        int c1;

        c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);

    }
}
