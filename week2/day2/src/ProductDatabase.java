import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println("The most expensive product is "+ Collections.max(products.values()));
        int sum = 0;
        for (int num:products.values()){
            sum = sum+num;
        }
        System.out.println("The avarage price is " + sum/  products.size());
       // int prod = 0;
       // for (Map.Entry<String , Integer > entry : products.entrySet()){
        // }
        //}
        //System.out.println("Total items below 300 : "+prod);
    }
}
