import java.sql.SQLOutput;
import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        System.out.println("Gimmie a  number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if  (number <= 0)
            {
            System.out.println("Kicsi szam");
            }
        else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number >=3 ) {
            System.out.println("Too big");
        }
    }
}
