class employee{
    String name;
    int id ;
    int sallary;

    public void Getdetails(){
        System.out.println( "" + name +" "+ id +" "+ sallary);
    }
}

public class CC {
    public static void main(String[] args) {
        
        employee obj = new employee();

        obj.name = "Yogesh";
        obj.id = 151;
        obj.sallary = 5000000;
        
        employee r = new employee();
        r.name = "Rahul";

        obj.Getdetails();
        r.Getdetails();
        // System.out.println(obj.name + " " +  obj.id + " " + obj.sallary);
        // System.out.println(r.name);
    }
}
