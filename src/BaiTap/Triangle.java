package BaiTap;

public class Triangle {
    //attribute
    String soundFile;

    //method
    public Triangle(String soundFile){
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println("Ratating 360......");
        this.playSound();
    }

    void playSound(){
        System.out.println("Play sound: "+this.soundFile);
    }
}
