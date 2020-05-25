import java.util.Scanner;

public class AvarageOfInpuit {
    public static void main(String[] args) {

        System.out.println("Gimmie a number(1/5)");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();

        System.out.println("Gimmie a number(2/5)");
        double num2 = scanner.nextInt();

        System.out.println("Gimmie a number(3/5)");
        double num3 = scanner.nextInt();

        System.out.println("Gimmie a number(4/5)");
        double num4 = scanner.nextInt();

        System.out.println("Gimmie a number(5/5)");
        double num5 = scanner.nextInt();


        double sum = num1 + num2 + num3 + num4 + num5;
        double avg = sum / 5;
        System.out.println("So the sum of your number is " + sum + " and the avarage is " + avg);


    }
}