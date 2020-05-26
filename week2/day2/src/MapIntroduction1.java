import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> charachters = new HashMap<Integer, String>();
        System.out.println(charachters.isEmpty());
        System.out.println();
        charachters.put(97,"a");
        charachters.put(98,"b");
        charachters.put(99,"c");
        charachters.put(65,"A");
        charachters.put(66,"B");
        charachters.put(67,"C");
        for (Integer i : charachters.keySet()) {
            System.out.println(i);
        }
        for (String i : charachters.values()) {
            System.out.println(i);
        }
        System.out.println();
        charachters.put(68,"D");
        System.out.println(charachters.get(99));
        System.out.println(charachters.size());
        charachters.remove(97);
        System.out.println(charachters.containsKey(100));
        charachters.clear();
        System.out.println(charachters);
    }
}
