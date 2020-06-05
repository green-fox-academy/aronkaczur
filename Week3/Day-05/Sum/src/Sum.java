import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        fill(numbers);
        System.out.println(sumOfElements(numbers));

    }

    private List<Integer> list;
    public Sum(){
        list = new ArrayList<Integer>();
    }

    public static int sumOfElements(ArrayList<Integer> array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;

    }

    public static ArrayList<Integer> fill(ArrayList<Integer> arr) {
        for (int i = 0; i < 10; i++) {
            arr.add(i + 1);
        }
        return arr;
    }
}