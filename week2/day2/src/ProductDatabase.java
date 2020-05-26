import java.util.Collections;
import java.util.HashMap;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String , Integer> products = new HashMap<String, Integer>();
        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken",550);
        System.out.println("The price of the fish is "+ products.get("Fish"));
        String mostExpensive=Collections.max(products.values());
        System.out.print("The most expensive product is");
    }
}
