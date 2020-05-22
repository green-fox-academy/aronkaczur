import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Gimmie numbers (second numbers must be bigger)");
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        System.out.println("Gimmie one more number (second numbers must be bigger)");
        int numb2 = scanner.nextInt();
        if (numb1>numb2) {
            System.out.println("Second number should be bigger ");
        }   else
                for (numb1 =<numb2; numb1++){
                    System.out.println(numb1);
                }

    }
///nincs kész még sorry
}
