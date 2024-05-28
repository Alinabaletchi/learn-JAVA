package org.example.device;

public class Tablet extends MobileDivace{

    private String pencilSupport;


    public Tablet(double displaySize, double ramMemory, String cpu, String operatingSystem, String deviceType, String pencilSupport) {
        super(displaySize, ramMemory, cpu, operatingSystem, deviceType);
        this.pencilSupport=pencilSupport;


    }

    @Override
    public void showDeviceInfo() {
        super.showDeviceInfo();
        System.out.println("Pencil Support: "+pencilSupport);
    }
}
