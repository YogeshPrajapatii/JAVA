import java.util.Scanner;

public class Patterns_using_loops {public static void main(String[] args) {
    //  Problem 1 --> Rectangle(Using nested loop).
   
    // Scanner sc=new Scanner(System.in);
    // int n= sc.nextInt();

    // Scanner xy=new Scanner(System.in);
    // int m= xy.nextInt();

    // //  Outer loop. --> Rows.
    // for(int i=1; i<=n; i++ ){
    // // Inner loop. --> Column.
    // for(int j=1; j<=m; j++){
    // System.out.print("*");
    // }    
    // System.out.println();
    // }
    // sc.close();
    // xy.close();


    //  Problem 2 --> Wholo REctangle.

    // Scanner sc=new Scanner(System.in);
    // int n= sc.nextInt();

    // Scanner xy=new Scanner(System.in);
    // int m= xy.nextInt();

    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=m; j++){
     
    // if (i==1 || j==1 || i==n || j==m) {
    //     System.out.print("*");
    // } else{System.out.print(" ");}    
    // }    
    // System.out.println();
    // }
    // sc.close();
    // xy.close();

    // Problem 3 Half Pyramid.

    // Scanner sc=new Scanner(System.in);
    // int n= sc.nextInt();

    // // Scanner xy=new Scanner(System.in);
    // // int m= xy.nextInt();

    // for( int i = 1; i<=n; i++){
    // for(int j=1; j<=i; j++){
    //     System.out.print("*");
    // }    
    // System.out.println();
    // }
    // sc.close();


//    Problem 4 --> Inverted half Pyramid.

    Scanner sc = new Scanner(System.in); // Taking no. of rows as user input.
    int n = sc.nextInt();

    for(int i = n; i>=1; i--) // Outer loop.
    {

        for(int j = 1; j<=i; j++) // Inner loop.
        {
          System.out.print("*");
        } System.out.println();
    }
sc.close();
    // Problem 5 --> Inverted half pyramid 180 degree rotated.

    // Scanner s = new Scanner(System.in);
    // int n = s.nextInt();

    // Outer for loop. 
    // for(int i = 1; i<=n; i++){

    //     // 1st inner loop --> Print space.
    //     for(int j=1; j<=n-i; j++){System.out.print(" ");}

    //     // 2nd inner loop --> Print * .
    //     for (int j = 1; j<=i; j++){System.out.print("*");}

    //     System.out.println();
    //     s.close();
    // }

    // Problem 6 --> Half pyramid with numbers.

    // Scanner s = new Scanner(System.in);
    // int n = s.nextInt();
    // // Outer loop.
    // for(int i = 1; i<=n; i++){

    // // Inner loop.
    // for(int j = 1; j<=i; j++){
    //         System.out.print(j);
    //     } System.out.println();
    // }

    // Problem 7 --> Inverted Half pyramid with numbers.

    // Scanner sc = new Scanner(System.in); // Taking no. of rows as user input.
    // int n = sc.nextInt();

    // // Outer loop.
    // for(int i=1; i<=n; i++){

    // // Inner loop.
    // for(int j=1; j<=n-i+1; j++){System.out.print(j);}

    // System.out.println();
    // }

    // Problem 8 --> Floyd's triangle.

    // Scanner sc = new Scanner(System.in); // Taking no. of rows as user input.
    // int n = sc.nextInt();

    // int number = 1;

    // // Outer loop.
    // for(int i=1; i<=n; i++){

    //     // Inner loop.
    //     for(int j=1; j<=i; j++){
    //         System.out.print(number +" ");
    //         number++; // number +1
    //     }
    //     System.out.println();
    // }

    // Problem 9 --> Zero One triangle. 

    // Scanner sc = new Scanner(System.in); // Taking no. of rows as user input.
    // int n = sc.nextInt();

    // // Outer loop.
    // for(int i=1; i<=n; i++){

    //     // Inner loop.
    //     for(int j=1; j<=i; j++){

    //     int sum = i+j;
    //     if(sum % 2 == 0){System.out.print("1 ");}
    //     else{System.out.print("0 ");}    
    //     }
    //     System.out.println();
    // }

    // Problem 4 --> Inverted half triangle.

    
        
       

}
    
}
