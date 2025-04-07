package Inheritance;
class Device{
    private int deviceId;
    private String status;


    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    public int getDeviceId(){
        return deviceId;
    }
    public String getStatus(){
        return status;
    }
    public void displayStatus(){
        System.out.println("Device ID: " + deviceId);
        System.out.println("Current Status: " + status);
    }
}
class Thermostat extends Device{
    private String temperatureSetting;


    public Thermostat(int deviceId, String status, String temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("Thermostat Temperature Setting: " + temperatureSetting);
    }
}
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(1, "Active", "Hot");
        t.displayStatus();
    }
}
