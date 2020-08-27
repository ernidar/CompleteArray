import java.util.Arrays;
import java.util.Scanner;


public class CompleteArray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        int addedSum;
        Scanner keybr = new Scanner (System.in);
        System.out.println("The list of numbers are :");
        addedSum = 0;
        System.out.println(addedSum);

        for (int i = 0; i < numbers.length; i++) {
            addedSum = addedSum + numbers[i];
        }

        System.out.println(addedSum);

        System.out.println(Arrays.toString(numbers));

    }
}
