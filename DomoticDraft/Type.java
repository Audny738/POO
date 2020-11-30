/**
 * JUSTIFICACION 
 * Escogi este opcion porque es mas sencila de imprementar a nivel codigo, no requiere tantas 
 * clases y aun no tenemos otro tipo de metodos especificados para cada tipo de dispositivo,
 * hasta ahora, todos los metodos son setters y getters y alguno como comparacion;
 * por lo cual aun no es necesario la sobreescritura que ofrece la herencia.
 * La desventaja es que no todos los dispositivos comparten las mismas caracteristicas, como ejemplo, 
 * las lamparas no tienen WIFI, entonces cuando se cren metodos diferentes a los que ya tenemos no
 * se va a poder de cierta manera "privatizar" metodos que solo podrian asociarse con la TV o con 
 * las lamparas, etc.
 */
public enum Type{
    TV("TV"), AC("AC"), CAM("Camaras"), LAMP("Lamparas");
    public final String typeDevice;

    /**
     * 
     * @param type
     */
    Type(String type){
        this.typeDevice = type;
    }

    public String getType(){
        return typeDevice;
    }

    public String toString(){
        String output = null;
        switch(this){
            case TV: output ="TV"; break;
            case AC: output ="Aire acondicionado"; break;
            case CAM: output ="Camaras"; break;
            case LAMP: output ="Lamparas"; break;
        }
        return output;
    }
    
}
