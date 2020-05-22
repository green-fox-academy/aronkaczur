import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Gimmie a  number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2==0)
            System.out.println("Páros");
        else
            System.out.println("Páratlan");
    }
}


