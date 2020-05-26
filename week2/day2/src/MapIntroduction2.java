import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String , String>();
        books.put("978-1-60309-452-8", "A Letter to Jo");
        books.put("978-1-60309-459-7", "Lupus");
        books.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        books.put("978-1-60309-461-0", "The Lab");
        for(Map.Entry<String  , String> m : books.entrySet()){
            System.out.println(m.getValue()+ "(ISBN:"+m.getKey()+")");
        }
        books.remove("978-1-60309-444-3");
        books.values().remove("The Lab");
        System.out.println();
        for(Map.Entry<String  , String> m : books.entrySet()){
            System.out.println(m.getValue()+ "(ISBN:"+m.getKey()+")");
        }
        books.put("978-1-60309-450-4", "They Called Us Enemy");
        books.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println();
        books.containsKey("478-0-61159-424-8");
        System.out.println();
        System.out.println(books.get("978-1-60309-453-5"));


    }
}
