package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie firstSharpie = new Sharpie("Black",50f,150f);
        firstSharpie.use();
        firstSharpie.use();
        firstSharpie.use();
        firstSharpie.use();
        firstSharpie.use();
        firstSharpie.use();
        System.out.println(firstSharpie.inkAmount);
            }
}
