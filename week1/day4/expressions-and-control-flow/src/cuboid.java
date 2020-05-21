public class cuboid {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int c = 15;
        int v = a * b * c;
        int ao = 2 * (a*b + a*c + b*c);
        System.out.println("Surface Area:" + v);
        System.out.println("Volume :" +ao);
    }
}
