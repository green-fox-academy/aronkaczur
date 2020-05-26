import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class personalfinance {
    public static void main(String[] args) {
        ArrayList<Integer> spending = new ArrayList<>();
        Collections.addAll(spending, 500 , 1000, 1250, 175, 800, 120);
        System.out.println(spending);
        int sum = 0;
        for (int num:spending){
            sum = sum+num;
        }
        System.out.println("You spent totally; " +sum);
        System.out.println("Bigges spending was : "+ Collections.max(spending));
        System.out.println("Lowest spending was :" +Collections.min(spending));
        System.out.println("Your avarage spent was :"+ sum/spending.size());

    }
}
