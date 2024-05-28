package org.example.device;
//Create a MobileDevice class to be the base class with fields:
//
//display size
//RAM memory
//cpu
//operating system
//device type
//
//Create two additional classes that inherit from the MobileDevice class:
//MobilePhone with fields: LTE support
//Tablet -> pencil support
//Create a method in the base class:
//
//showDeviceInfo which will display device details
//method should be overridden in derived classes (displaying additional details)
public class MobileDivace {

     private double displaySize;
    private double ramMemory;
    private String cpu;
    private String operatingSystem;

    private String deviceType;

    public MobileDivace(double displaySize, double ramMemory, String cpu, String operatingSystem, String deviceType) {
        this.displaySize = displaySize;
        this.ramMemory = ramMemory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.deviceType = deviceType;
    }

    public void showDeviceInfo(){
        System.out.println("Device Type: " + deviceType);
        System.out.println("Display Size: " + displaySize + " inches");
        System.out.println("RAM Memory: " + ramMemory + " GB");
        System.out.println("CPU: " + cpu);
        System.out.println("Operating System: " + operatingSystem);

    }
}
