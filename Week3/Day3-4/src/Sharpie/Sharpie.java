package Sharpie;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class Sharpie {
    public String color;
    public float width;
    public float inkAmount = 100f;

    public  Sharpie(String color ,float width, float inkAmount){
        this.color= color;
        this.width = width;
        this.inkAmount = inkAmount;
    }
    public float use(){
        System.out.println("Sharpie use.."+ this.color);
        inkAmount--;
        return this.inkAmount;
    }

}
