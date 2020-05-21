import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Hello user, lets insert miles");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextInt();
        double km = 0;
        km = miles *= (1.609344);
        System.out.println(miles+" km Well Done");


    }
}
