import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> telephone = new HashMap<String, String>();
        telephone.put("William A. Lathan", "405-709-1865");
        telephone.put("John K. Miller", "402-247-8568");
        telephone.put("Hortensia E. Foster", "606-481-6467");
        telephone.put("Amanda D. Newland", "319-243-5613");
        telephone.put("Brooke P. Askew", "307-687-2982");
        System.out.println("The phone number what we are looking for is :" + telephone.get("John K. Miller"));
        System.out.println(getKeyFromValue(telephone, "307-687-2982"));
        System.out.println("Do we know Chris E. Myers' phone number? The answer is " + telephone.containsKey(" Chris E. Myers"));

    }

    public static Object getKeyFromValue(Map telephone, Object value) {
        for (Object o : telephone.keySet()) {
            if (telephone.get(o).equals(value)) {
                return o;
            }
        }
        return null;

    }


}
