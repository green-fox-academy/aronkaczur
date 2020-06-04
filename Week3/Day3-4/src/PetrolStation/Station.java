package PetrolStation;

public class Station {
    static int gasAmount = 5000;

    public static int getGasAmount(){
        return gasAmount;
    }

    public static void refill(Car car){
        car.gasAmount += car.capacity;
        gasAmount -= car.capacity;
    }

}
