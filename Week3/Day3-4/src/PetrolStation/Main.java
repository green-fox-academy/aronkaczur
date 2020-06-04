package PetrolStation;

public class Main {
    public static void main(String[] args) {
            Car firstcar = new Car();
        System.out.println("Petrol station :"+Station.gasAmount);
        System.out.println("Car :" + firstcar.gasAmount);
        Station.refill(firstcar);
        System.out.println("Petrol station :"+Station.gasAmount);
        System.out.println("Car :" + firstcar.gasAmount);


    }
}
