import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shopper = new ArrayList<>();
        Collections.addAll(shopper,"Eggs","Milk","Fish","Apples","Bread","Chicken");
        System.out.println("Do we have milk on the list?");
        System.out.println(shopper.contains("Milk"));
        System.out.println("Do we have bananas on the list?");
        System.out.println(shopper.contains("Bananas"));
    }
}
