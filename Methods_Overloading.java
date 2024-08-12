public class Methods_Overloading {
// 1 -- Void is used when we don't want to return any value.
    // static void telljoke() {
        // System.out.println(" I invented a new word!\n Plagiarism!");
    // }

    // 2. -- Changing the integer.

    // static void change(int a){
    //      a =98;
    // }
    // public static void main(String[] args) {
    //     // telljoke();

    //     int[] marks={58,96,78,85,99,100,97};

    //     int x = 45;
    //     change(x);
    //     System.out.println(x);
    //  }

    // 3 -- Changing refference of array is possible.

    //  static void change2(int[] arr){
    //    arr[0]=78;
    //  }
    // public static void main(String[] args) {
       
    //     int[] marks = {98, 68 , 78, 99, 100};
    //     change2(marks);
    //     System.out.println(marks[0]);


    // }

    // 4 -- Method Overloading ( Functions can have same name but different parameters).

   static void y(){
    System.out.println("Good Morning bro !");

   
   }
   static void y(int a){
    System.out.println("Good Morning" + a + "Bro");
}

public static void main(String[] args) {
    
    y();
    y(0);
}
}
