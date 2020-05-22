import java.util.Scanner;

public class Multiplator {
    public static void main(String[] args) {
        System.out.println("Gimmie a number");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        System.out.println("So the number what you would like to multipler is " + numb);
        for (int i = 1; i < 16; i++) {
            System.out.println("So the numbers: " + (i) + "*" + (numb) + "=" + (i * numb));
        }

    }
}
