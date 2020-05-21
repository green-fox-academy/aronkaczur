import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("How many chickens do u have?");
        Scanner scanner =  new Scanner(System.in);
        int chicks = scanner.nextInt();
        int chicklegs = chicks * 2;
        System.out.println("Excellent, and how many pigs do u have?");
        Scanner scanner2 = new Scanner(System.in);
        int pigs = scanner.nextInt();
        int piglegs = pigs * 4;
        System.out.println("You have " +(piglegs+chicklegs)+"  legs in your farm");


    }
}
