package org.example.device;

public class MobilePhone extends MobileDivace{

    private String lteSupport;

    public MobilePhone(double displaySize, double ramMemory, String cpu, String operatingSystem, String deviceType, String lteSupport) {
        super(displaySize, ramMemory, cpu, operatingSystem, deviceType);
        this.lteSupport=lteSupport;
    }

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("LTE Support: " + lteSupport);
    }
}
