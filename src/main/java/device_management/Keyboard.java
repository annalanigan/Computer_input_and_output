package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String language;

    public Keyboard(String language){
        this.language = language;
    }

    public String sendData(String data) {
        return data;
    }
}
