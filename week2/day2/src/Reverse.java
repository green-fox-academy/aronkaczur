public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println(toBeReversed);
        String reversedString = "";
        for (int i =toBeReversed.length()-1; i>=0;i--){
            reversedString = reversedString + toBeReversed.charAt(i);

        }
        System.out.println(reversedString);
    }
}
