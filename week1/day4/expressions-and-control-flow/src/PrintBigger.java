import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Gimmie a  number!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Gimmie another  number!");
        int number2 = scanner.nextInt();
        System.out.println("So your numbers is "+number+ " and " +number2);
        if (number>number2){
            System.out.println(number+ "is bigger");
        }        else if (number==number2){
            System.out.println("Egyenlő a két szám");
        }
            else
        {
            System.out.println(number2+ " is bigger");
        }
    }
}

