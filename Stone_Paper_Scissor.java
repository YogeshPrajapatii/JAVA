import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissor {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1 for rock , 2 for scissor , 3 for paper  ");
        int pc_choice = rand.nextInt(3) + 1;
        int user_choice = sc.nextInt();

        if (user_choice == 1 && pc_choice == 2 || user_choice == 2 && pc_choice == 3
                || user_choice == 3 && pc_choice == 1) {
            System.out.println("You win!");
        } else if (user_choice == 1 && pc_choice == 3 || user_choice == 2 && pc_choice == 1
                || user_choice == 3 && pc_choice == 2) {
            System.out.println("PC wins! Try next time.");

        } else {
            System.out.println("Match Draw");
        }

        if (pc_choice == 1) {
            System.out.println("PC chooses Rock.");

        } else if (pc_choice == 2) {
            System.out.println("PC chooses Scissor.");

        } else {
            System.out.println("PC chooses Paper.");

        }

        sc.close();
    }
}
