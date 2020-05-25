public class Factorio {

    public static void main(String[] args) {
        int num = 7;
        System.out.println(+factorio(num));

    }

    public static int factorio(int fact) {
        int total = 1;
        for (int i = 1; i <= fact; i++) {
            total  *= i;

        }
        return total;
    }

}
