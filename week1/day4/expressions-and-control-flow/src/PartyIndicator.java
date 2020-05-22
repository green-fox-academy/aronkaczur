import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Lets party. How many boys attending?");
        Scanner scanner = new Scanner(System.in);
        int boys = scanner.nextInt();
        System.out.println("Ok. Sounds great. How many girs attending?");
        int girls= scanner.nextInt();
        int totalNumber= girls+boys;
        System.out.println(totalNumber);
        if (totalNumber >= 20 && girls==boys ){
            System.out.println("The party is excellent");
        }

        else if (totalNumber>=20){
            System.out.println("Quite cool party");
        }
        else if (girls>0) {
            System.out.println("Avarage party");
        }

        else if (girls == 0){
            System.out.println("Sausage party");
        }
    }
}
