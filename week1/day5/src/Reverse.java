import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        System.out.println("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("Array in reverse");
        for (int i = numbers.length-1; i >= 0; i-- ) {
            System.out.print(numbers[i]+" ");

        }

//
     //   int[] temp ={};
     //   temp[0]=numbers[4];
     //   temp[1]=numbers[3];
     //   temp[2]=numbers[2];
     //   temp[3]=numbers[1];


     //   numbers[0]=temp[0];
     //   numbers[1]=temp[1];
      //  numbers[2]=temp[2];
      //  numbers[3]=temp[3];

        System.out.println("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
