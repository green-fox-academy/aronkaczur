public class Flower extends Garden{

    public Flower(String color, double waterLevel) {
        super(color, waterLevel);
        this.type ="Flower";
    }
    public double wateringFlowers(int amount){
        System.out.println("Watering with "+amount);
        if (this.waterLevel>5){
           return waterLevel=+amount*0.75;
        }

        return waterLevel;
    }



}
