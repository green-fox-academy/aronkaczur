import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gimme first number ");
        int num1 = scanner.nextInt();

        System.out.println("Gimme me second number ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The second number must be bigger");
        } else {

            int dif = num2 - num1;

            for (int i = 0; i < dif; i++) {

                System.out.println(num1 + i);
            }
        }
    }

}
