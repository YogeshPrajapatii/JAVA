/*interface Car{

    int a = 4; // In interface if a property is declared than it's final.
               // It can't be update by the objects.

    void hornBlow();
    void pressBreake();
}

interface Bike{
    void accelrateRace();
}

class Jeep implements Car,Bike{

    public void hornBlow(){System.out.println("Blow's Jeep horn.");}
    public void pressBreake(){System.out.println("Jeep break pressed.");}
    public void accelrateRace(){System.out.println("Speed Up bike.");}
} 

public class Interfaces {
    public static void main(String[] args) {
        
        Jeep jj = new Jeep();

        System.out.println(jj.a);
        jj.hornBlow();
        jj.pressBreake();
    }
}*/
