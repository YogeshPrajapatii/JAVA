import java.util.Scanner;

public class If_Else_If_and_Switch {
    public static void main(String[] args) {

    //          1 IF ELSE STATEMENT

        // int age = 30;
    // if(age==18){System.out.println("You can join college now.");}
    // else if(age==19){System.out.println("You are a jounier");}
    // else if(age==20){System.out.println("You are in 2nd year");}
    // else if(age==21){System.out.println("You are in 3rd year");}
    // else if(age==22){System.out.println("You are a final year student now");}
    // else if(age==23){System.out.println("You have completed your undergraduation education");}
    // else if(age==24){System.out.println("You are starting your own buisness now");}
    // else if(age==26){System.out.println("You established your buisness");}
    // else if(age==27){System.out.println("You are the richest man in your country");}
    // else if(age==28){System.out.println("You are running your buisness in other countries");}
    // else if(age==30){System.out.println("You are the powerfull and richest man on the earth!!");}



    //          2 SWITCH STATEMENT
    int Age;
    System.out.println("How old are you ?");
    Scanner sc = new Scanner(System.in);
    Age = sc.nextInt();
    
    switch(Age){
    
    case 18:
    System.out.println("You are young now");   
    break; 

    case 22:
    System.out.println("You are doing buisness");   
    break; 

    case 23:
    System.out.println("You are semi experienced now");   
    break; 

    case 25:
    System.out.println("You are very experienced  now");   
    break; 

    default:
    System.out.println("Enjoy your life");
    
    sc.close();


    }


    
    }
 }
    