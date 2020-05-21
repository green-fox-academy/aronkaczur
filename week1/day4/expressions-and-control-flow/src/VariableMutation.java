public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        a += 10;
        System.out.println(a);


        int b = 100;
        b -= 7;
        System.out.println(b);


        int c = 44;
        c *= c;
        System.out.println(c);


        int d = 125;
        d /= 5;
        System.out.println(d);


        int e = 8;
        e *= e *= e;
        System.out.println(e);


        int f1 = 123;
        int f2 = 345;
        boolean megoldas =  f1 > f2;
        System.out.println(megoldas);

        int g1 = 350;
        int g2 = 200;
        boolean megoldas2 = g2 > g1;
        System.out.println(megoldas2);

        int h = 135798745;
        boolean megoldas3 = h % 11 ==0 ;
        System.out.println(megoldas3);

        int i1 = 10;
        int i2 = 3;
        boolean megoldas4 = i1> i2*i2 && i1 < i2 * i2 * i2;
        System.out.println(megoldas4);

        int j = 1521;
        boolean megoldas5 = j % 3 == 0 || j % 5 == 0;
        System.out.println(megoldas5);

    }
}
