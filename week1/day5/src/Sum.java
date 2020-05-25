public class Sum {
    public static void main(String[] args) {
        int num = 44;
        System.out.println(+sum(num));
        num=99;
        System.out.println(+sum(num));
        num=888;
        System.out.println(+sum(num));
    }
    public static int sum(int sum){
        int total = 0;
        for (int i = 0; i < sum; i++) {
            total += i;

        }
        return total;
    }

}
