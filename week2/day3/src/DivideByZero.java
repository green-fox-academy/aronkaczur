import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number");
        int divisor = scanner.nextInt();
        divide10ByNumber(divisor);



    }
    public static void divide10ByNumber ( int divisor){

        try{
            int result =10 / divisor;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Fail");
            System.exit(2);
        }

    }
}
