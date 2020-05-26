import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SolarSysytem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(ptSaturn(planetList));
    }
    public static ArrayList ptSaturn (ArrayList a){
        if (!a.contains("Saturn")){
            a.add(4,"Saturn");
        }
        return a;
    }
}
