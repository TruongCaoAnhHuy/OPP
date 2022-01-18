package oo.Picture;

public class Circle {
    String action, sound;

    Action_Sound ac_s = new Action_Sound();

    public String getAction() {
        return action;
    }

    public String getSound() {
        return sound;
    }

    public void action_sound(){
        ac_s.action_sound();
    }
}
