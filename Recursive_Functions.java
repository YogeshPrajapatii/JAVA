// 1. Recursive approach.

// import java.util.Scanner;
// public class Recursive_Functions {

//     static int factorial( int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         else{
//         return n * factorial(n-1);
//         }
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Calculate factorial value of ");
//         int x = sc.nextInt();

//         System.out.println("The factorial value of this number is: " + factorial(x));

//         sc.close();
//     }
// }

// 2. Iterative approach.

public class Recursive_Functions {

    static int factorial_Iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
         else {
            int product = 1;

            for (int i=1; i<=n; i++) {
                product *= i;
            }
            return product;
        }

    }

    public static void main(String[] args) {

        int x = 4;
        System.out.println(factorial_Iterative(x));

    }
}