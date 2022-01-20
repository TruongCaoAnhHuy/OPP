package oo.Shape;

//import oo.Action_Sound;

public class Triangle {
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
