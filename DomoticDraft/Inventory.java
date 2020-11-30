/**
 * @author Audny Correa 
 * 
 */


public class Inventory{
    private Device devices[] = new Device[20];
    private static int cont;

    /**
     * Metodo que añade el dispositivo en el arreglo
     * @param device
     */

    public void addDevice(Device device){
        devices[cont] = device;
        cont++;
    }


    public Device getDevice(){
        return devices[cont];
    }


    /**
     * Metodo que busca si el dispositivo ingresado esta dentro del arreglo
     * @param device
     * @return 
     */
    public Device searchDevice(Device device){
        boolean condition = true;
        

        for(int i=0; i<devices.length; i++){
            if (devices[i].equals(device)){ 
                condition = true; 
                //return devices[i];
                break;
            }else{
                condition= false;
            }
        }
        if(condition){
            System.out.println("Searched");
            return device; 
        }else{
            return null;
        }
    }

    /**
     * 
     */
    public void createInventory(){
        /**Brand brand = Brand.LG;
        DeviceSpecs deviceInfo = new DeviceSpecs(brand, "x1" , true , true);
        Device device0 = new Device(0, true, "AC", deviceInfo);
        devices[0] = device0;
        Device device1 = new Device(0, false, "TV", deviceInfo);
        devices[1] = device1;*/
        for(int i = 0; i<cont; i++){
            System.out.println(devices[i]);
        }
    }
}