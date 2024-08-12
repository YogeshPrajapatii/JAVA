public class test {
    static void p(int n){
        for(int i = n; i>=1; i--) // Outer loop.
        {
    
            for(int j = 1; j<=i; j++) // Inner loop.
            {
              System.out.print("*");
            } System.out.println();
        }
    }
    public static void main(String[] args) {
        p(4);
    }
}
