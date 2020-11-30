public class DeviceSpecs{
    private Brand brand;
    private String model;
    private boolean wifiBuiltIn;
    private boolean bluetoothwifiBuiltIn; 
    private Type typeDevice;

    public DeviceSpecs(){
        this.brand = null;
        this.model = null;
        this. wifiBuiltIn = false;
        this.bluetoothwifiBuiltIn = false;
        this.typeDevice = null;

    }

    public DeviceSpecs(Brand brand, String Model, boolean valueWifi, boolean valueBluetooth, Type type){
        this.brand = brand;
        this.model = Model;
        this. wifiBuiltIn = valueBluetooth;
        this.bluetoothwifiBuiltIn = valueBluetooth;
        this.typeDevice = type;

    }

    public void setBrand(Brand brand){
        this.brand = brand;
    }

    public Brand getBrandName(){
        return brand;
    }
    
    public void setModel(String Model){
        this.model = Model;
    }

    public String getModel(){
        return model;
    }

    public void setWifi(Boolean value){
        this.wifiBuiltIn = value;
    }

    public Boolean getWifi(){
        return wifiBuiltIn;
    }

    public void setBluetooth(Boolean value){
        this.bluetoothwifiBuiltIn = value;
    }

    public Boolean getBluetooth(){
        return bluetoothwifiBuiltIn;
    }

    public void setType(Type type){
        this.typeDevice = type;
    }

    public Type getType(){
        return typeDevice;
    }

    public String toString(){
        String output;
        output = "\n" +"Type: " + this.typeDevice + "\n" +
                 "Brand: " + this.brand.getBrandName() + "\n" +
                 "Model: " + this.model + "\n" +
                 "Wifi: " + this.wifiBuiltIn + "\n" +
                 "Bluetooth: " + this.bluetoothwifiBuiltIn;
        
        return output;
    }
}