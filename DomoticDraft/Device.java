public class Device {
    private int Id;
    private boolean Status;
    private String Name;
    //private Brand brand ;
    private DeviceSpecs deviceSpecs;

    public Device() {
        this.Id = 0;
        this.Status = false;
        this.Name = null;
        this.deviceSpecs = null;
    }

    public Device(int Id, boolean Status, String Name, DeviceSpecs info) {
        this.Id = Id;
        this.Status = Status;
        this.Name = Name;
        this.deviceSpecs = info;
    }

    public int getId() {
        return Id;
    }

    public boolean getStatus(){
        return Status;
    }

    public String getName(){
        return Name;
    }

    public DeviceSpecs getDeviceSpecs() {
        return deviceSpecs;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setStatus(boolean status) {
        this.Status = status;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setBrand(DeviceSpecs info){
        this.deviceSpecs = info;
    }
    public String toString(){
        String output;
        output = "ID: " + this.Id +"\n" +
                "Status: " + this.Status + "\n"+
                "Name: " + this.Name + "\n" +
                "Specs: " + this.deviceSpecs + "\n";
        return output;
    }

}    