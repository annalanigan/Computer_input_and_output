package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;

    public Mouse(String type){
        this.type = type;
    }

    public String sendData(String data) {
        return data;
    }

    public String click(){
        return "CLICK";
    }
}
