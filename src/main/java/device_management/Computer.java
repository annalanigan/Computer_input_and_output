package device_management;

import behaviours.IOutput;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput device;

    public Computer(int ram, int hddSize, IOutput device) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.device = device;
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
}
