import java.util.ArrayList;
import java.util.Collections;

public class ListIntrocution2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>() ;
        listB.addAll(listA);
        System.out.println(listA.contains("Durian"));
        listA.add(4, "Kiwifruit");
        System.out.println("First list containts "+listA.size()+" second list contains "+listB.size()+" elements");
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.add("Passion Fruit" );
        System.out.println(listB);
        Collections.addAll(listB,"Passion Fruit","Pomelo");
        System.out.println(listB);
        System.out.println(listA.get(2));



    }
}
