public class Greet {
    public static void main(String[] args) {
        String al ="Green Fox";
        System.out.println(greet(al));
    }
    public static String greet(String greet){
        greet = "Greetings dear, " + greet;
        return greet;
    }
}
