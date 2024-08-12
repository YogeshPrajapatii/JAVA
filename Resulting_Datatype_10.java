public class Resulting_Datatype_10 {
    public static void main(String[] args) {
        // Increment\Decrement Operator
        // ++a (In this first increment the value then use it.)
        // a++ (In this first use the value then increment it.)

        // --a (In this first decrement the value then use it.)
        // a-- (In this first use the value then decrement it.)

        int a = 55;
        System.out.println(a--);// Isme phle a ki value use hogi baad me decrement hoga.
        System.out.println(a);
        
        int b = 34;
        System.out.println(--b);// Isme phle decrement hoga baad me b ki value use hogi.
        
        int x = 99; 
        int y = ++x; // Isme phle x ki value me increment hoga. Baad me x ki value y me assign ho jaegi.
        System.out.println(y);
        
        int z = 7;  // Quick Quize
        int p = ++z*8; 
        System.out.println(p);

        char c = 'A'; // How it works on character.
        char g = ++c;
        System.out.println(g);
    }
    
}
