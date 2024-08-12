public class Variable_Arguments {

    static int sum(int... arr ){

    int result = 0;
    for(int a: arr){
     result +=a;
    }
    return result;}
    public static void main(String[] args) {
        System.out.println(sum(1,12,98,85));
        
    }
}
