import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // <datatype> [] <arrayName> = new <datatype>[<size>];
        int [] numberArray = new int[5];
        numberArray[0] = 1;
        numberArray[1] = 21;
        numberArray[2] = 63;
        numberArray[3] = 4;
        numberArray[4] = 51;

//        int [] numberArray = {1,21,63,4,51};

        System.out.println(Arrays.toString(numberArray));

        // <datatype> <arrayName> [] = new <datatype>[<size>];
        String stringArray[] = new String[7];
        System.out.println("Please enter the weekdays one by one");
        for (int i = 0; i < stringArray.length; i++ ){
            System.out.print("Day #" + (i+1) + ":");
            stringArray[i] = scanner.nextLine();

        }

        for (String temp: stringArray){
            System.out.print(temp + " ");
        }

//        System.out.println(Arrays.toString(stringArray));





        // <datatype> <arrayName>[] = { value1, value2, value3, ...}
        char charArray [] = {'a', 'b', 'c', 'd', 'e' };

//        for (int i = 0; i <charArray.length ; i++){
//            System.out.print(charArray[i] + " ");
//        }
        for (char tempChar: charArray){
            System.out.print(tempChar);
        }

        boolean booleanArray [] = new boolean[3];
        booleanArray[0] = true;
        booleanArray[1] = false;



//        for (int i = 0; i <charArray.length; i++ ){
//            if (charArray[i] == 'd'){
//                System.out.println("The index of 'd' is " + i);
//            }
//        }



    }
}


