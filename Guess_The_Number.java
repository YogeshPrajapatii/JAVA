import java.util.Random;
//import java.util.Scanner;

class Game {

    public int Number;
    public int User_Input;
    public int Number_Of_Guess = 0;

    Game() {

        Random rand = new Random();
        Number = rand.nextInt(100);
    }

    public void takeUserInput() {

        System.out.println("Guess the number");

        //Scanner sc = new Scanner(System.in);

        while (true) {
           // User_Input = sc.nextInt();

            if (User_Input >= 1 && User_Input <= 100) {
                break;

            } else {
                System.out.println("Enter a valid number.");
            }

        }

    }

    boolean isCorrect() {

        Number_Of_Guess++;

        if (Number == User_Input) {
            System.out.format("Yes! You guessed it right the number is %d\nYou guesed it in %d attempts. \n", Number,
                    Number_Of_Guess);

            return true;
        }

        else if (Number > User_Input) {
            System.out.println("Too low...");
        }

        else if (Number < User_Input) {
            System.out.println("Too high...");
        }

        return false;

    }
}

public class Guess_The_Number {
    public static void main(String[] args) {

        Game g = new Game();

        boolean b = true;

        while (b) {

            g.takeUserInput();

            if (g.isCorrect()) {

                break; 
            }
         
        }  
    }
}
