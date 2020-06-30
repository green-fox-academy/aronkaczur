import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        double avg = numbers.stream().filter(x -> x % 2 != 0).mapToDouble(Double::valueOf).average().getAsDouble();
        System.out.println(avg);
    }
}
