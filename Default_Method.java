interface Speaker {
    void playMusic();

    private void pauseMusic() {
        System.out.println("Pause the Music.");
    } // We can also add Private and Default methods in interfaces.

    default void changeMusic() {
        pauseMusic();// We can'taccess the private method of interface directly but we can use
                     // default methods to access it.
        System.out.println("Changing the Music.");
    };
}

interface Camera {
    void takePicture();

    void recordVideo();
}

class CellPhone {
    void pickCall() {
        System.out.println("Connecting...");
    };
}

class SmartPhone extends CellPhone implements Speaker, Camera {

    public void playMusic() {
        System.out.println("Playing Music...");
    }

    public void takePicture() {
        System.out.println("Clicking Pictues...");
    }

    public void recordVideo() {
        System.out.println("Recording Video...");
    }

}

public class Default_Method {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        // CellPhone cp = new SmartPhone(); // We can't creat objects of abstract class
        // but we can use reference of super class to make sub class objects..
        // cp.pickCall(); //
        // cp.playMusic();

        sp.playMusic();
        sp.takePicture();
        sp.recordVideo();
        sp.changeMusic();
    }
}
