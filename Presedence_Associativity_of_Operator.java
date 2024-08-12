public class Presedence_Associativity_of_Operator {
    public static void main(String[] args) {
    //Presedence = (Iska matlab ye h ki agar koi equation me multiple operators h to phle kon sa operator evaluate hoga. Ye baat us operator k presedence pe depend karti h)   
    /* Presedence Example =   int a = 6*5-34/2; 
                         =           30-34/2
                         =           30-17
                         =           13   
     

    */

    // Associativity = (Jab kisi equation me operators ki presedence equal ho to fir unhe unki associativity k base par evaluate kiya jata h )
    /* Associativity Example =    int b = 60/5-34*2;

    (Ab is situation me * and / ki presedence equal h to is equation ko solve krne k liye.
    hme ye inki associativity k base par evaluate krna hoga.
    Or is case me associativity Left to Right hogi.) 
    To is equation ka solution kuch is tarah hoga!
    
    int b = 60/5-34*2
          = 12-34*2
          = 12-68
          = -56        
    */

   // Quick Quize 
   /*  int a = 8;
    int b = 20;
    int k = a*b/2;
      
    System.out.println(k);
   */

   // Quize two
   int a=10;
   int b=0;
   int c=0;
   int k = b*b - (4*a*c) / (2*a); // Use perenthsis () in complicated equations it has highest presedence in all operator;


   System.out.println(k);
}
}
