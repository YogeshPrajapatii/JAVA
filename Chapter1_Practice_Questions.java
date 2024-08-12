import java.util.Scanner;

public class Chapter1_Practice_Questions {
    public static void main(String[] args) {
        // Make a calculator for cbse exam percentage calculator (Chapter 1 Quiz).

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Subject1 marks");
        float Subject1 = scan.nextFloat();

        System.out.println("Enter subject2 marks");
        float Subject2 = scan.nextFloat();

        System.out.println("Enter subject3 marks");
        float Subject3 = scan.nextFloat();

        System.out.println("Enter subject4 marks");
        float Subject4 = scan.nextFloat();

        System.out.println("Enter subject5 marks");
        float Subject5 = scan.nextFloat();

        float Percentage = (Subject1 + Subject2 + Subject3 + Subject4 + Subject5) / 500f * 100;

        System.out.print("Percentage = ");

        System.out.println(Percentage);
        scan.close();

    }
}
