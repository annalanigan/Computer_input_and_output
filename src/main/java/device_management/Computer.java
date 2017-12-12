package device_management;

import behaviours.IInput;
import behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput device;
    private IInput inDevice;

    public Computer(int ram, int hddSize, IOutput device, IInput inDevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.device = device;
        this.inDevice = inDevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.device;
    }

    public String outputData(String data) {
        return this.device.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.device = outputDevice;
    }

    public IInput getInputDevice() {
        return inDevice;
    }

    public String inputData(String data) {
        return this.inDevice.sendData(data);
    }
}
