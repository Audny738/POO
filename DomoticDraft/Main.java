public class Main{
    
    public static void main(String[] args) {
    Inventory inventory = new Inventory();

    
    Brand brand = Brand.LG;
    Type typeDevice = Type.TV;
    DeviceSpecs deviceSpecs = new DeviceSpecs(brand, "x1" , true , true, typeDevice);
    Device device = new Device(0, true, "TV1", deviceSpecs);
    Device device1 = new Device(1, true, "TV2", deviceSpecs);

    Brand brand1 = Brand.PANASONIC;
    Type typeDevice1 = Type.CAM;
    DeviceSpecs deviceSpecs1 = new DeviceSpecs(brand1, "x1" , true , true, typeDevice1);
    Device device2 = new Device(2, false, "CAM1", deviceSpecs1);
    Device device3 = new Device(3, false, "CAM2", deviceSpecs1);

    Brand brand2 = Brand.DAEWO;
    Type typeDevice2 = Type.LAMP;
    DeviceSpecs deviceSpecs2 = new DeviceSpecs(brand2, "x1" , true , true, typeDevice2);
    Device device4 = new Device(4, false, "LAMP1", deviceSpecs2);
    Device device5 = new Device(5, false, "LAMP2", deviceSpecs2);

    Brand brand3 = Brand.CARRIER;
    Type typeDevice3 = Type.AC;
    DeviceSpecs deviceSpecs3 = new DeviceSpecs(brand3, "x1" , true , true, typeDevice3);
    Device device6 = new Device(6, false, "AC1", deviceSpecs3);
    Device device7 = new Device(7, false, "AC2", deviceSpecs3);

    inventory.addDevice(device);
    inventory.addDevice(device1);
    inventory.addDevice(device2);
    inventory.addDevice(device3);
    inventory.addDevice(device4);
    inventory.addDevice(device5);
    inventory.addDevice(device6);
    inventory.addDevice(device7);
    inventory.createInventory();
    System.out.println(inventory.searchDevice(device));
    inventory.getDevice();
    
    }
}