import java.util.Scanner;
public class Chapter5_PS {
    public static void main(String[] args) {
        // Problem 1 --> INVERTED HALF PYRAMID USING LOOP.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // for(int i=n; i>=1; i--){
        // for(int j=1;j<=i;j++){System.out.print("*");} 
        
        // System.out.println();
        // }
        
        // Problem 2 --> Sum of first n even numbers using for loop.

        // int sum = 0;
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // for(int i=0; i<n; i++){
        // sum = sum+(2*i);      
        // }
        // System.out.print("The sum of first n even numbers is ="); 
        //  System.out.println(sum);  

        // Problem 3 --> Program to print multiplication table of given no.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // for(int i=1; i<=10; i++){
        // System.out.printf("%d X %d = %d \n", n, i, n*i);    
        // }

        // Problem 4 --> Write a program to print multiplication table of given no. in reverse order.
        
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // for(int i=10; i>=1; i--){
        // System.out.printf("%d X %d = %d \n", n, i, n*i);    
        // }

        //  Problem 5 --> Program to find factorial of given no. using while loop.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // int i = 1;
        // int factorial = 1;

        // while (i<=n) {
        // factorial *= i;            
        // i++;}
        // System.out.println(factorial);

        //  Problem 6 --> Program to find factorial of given no. using for loop.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // int factorial = 1;
        // for(int i=1; i<=n; i++ ){
        //    factorial *= i;
        // }
        // System.out.println(factorial);

        // Problem 7 --> Program to sum the numbers in multiplication table of a given no.

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        // int sum = 0;

        // for(int i=1; i<=10; i++){
        //     sum += n*i;
           
        // }
        //  System.out.println(sum);

        // Problem 8 --> Sum of first n even numbers using while loop.

        int sum = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i=1;
        while( i<n){

        sum = sum+(2*i);    
        i++;
        }
        System.out.print(sum);

        s.close();
    }
}
