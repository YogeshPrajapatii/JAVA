public class Strings_13 {
    public static void main(String[] args) {
       // HOW MANY TYPES WE CAN WRITE A STRING IN JAVA.

       // String name = new String("Yogesh Verma"); --> 1ST TYPE
       //String name = "Yogesh";  //  -->  Ham dono tariko se string ka use kar sakte h.
       //System.out.print("Yogesh");
       //System.out.println(name);
       
       // HOW MANY TYPES WE CAN PRINT OUTPUT IN JAVA ?     
        // Java me ham in statements ka use karke apne output ko print karva sakte h. //
        /* 

      (1)  System.out.println(); --> It prints a newline at the end.
      (2)  System.out.print();   --> It don't prints a newline at the end.
      (3)  System.out.format();  --> Is ka use bhi formatted output ko console par print karwane k liye kiya jata h.
      (4)  System.out.printf();  --> Iska use formatted output ko console par print karwane k liye kiya jata h.
                                  Isme ham placeholders (%s,%d,%c,%f) ka use kar sakte h. uske baad ham 
                                  variable ya extension ka use karte h to placeholders ki jagah use hote h. 
         
        */ 
        

        // THESE ARE THE METHODS OF STRING IN JAVA //


/*  (1) int words = name.length(); // --> Iska use karke hme pta chal jayega ki string ki length kitni h.
        System.out.println(words);
        
    (2) String lower = name.toLowerCase(); // --> String k sbhi uppercase character lowercase ho jayege.
        System.out.println(lower); 

    (3) String UPPER = name.toUpperCase(); // --> String k sbhi lowercase character uppercase ho jayege.
        System.out.println(UPPER); */


        // String ko trim kaise kre ?

        /*String Verma = new String("                                    Yogesh Verma");
        System.out.println(Verma);
        
  (4(A) System.out.println(Verma.trim()); // .trim() method ka use karke.
        String trimmedString = Verma.trim(); // New string ko trim string ka refference dekar.
  (4(B) System.out.println(trimmedString);*/

    // Substring Method //

 /* (5) String New = "Prajapati"; // Is se ham string ka start or end point decide kar sakte h.
        System.out.println(New.substring(2, 8));
 */

//  (6)  String name.replace --> To replace character or string.
     
 /*    String Name = "Yogesh";
       System.out.println(Name.replace('Y', 'O')); 
 */       

//  (7)  name.startswith / name.endswith

         String Name = "Yogesh";
         System.out.println(Name.startsWith("Yo"));
         System.out.println(Name.endsWith("s"));
         System.out.println(Name.charAt(4));
         System.out.println(Name.indexOf('o'));
         System.out.println(Name.indexOf('g', 02, 07));


    }
}
