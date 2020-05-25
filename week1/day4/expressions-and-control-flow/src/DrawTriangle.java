
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please give me a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
