import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min " + returnedMin);

    }

    public static int[ ] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas : ");
        String input = scanner.nextLine();

        String[] inputSplit = input.split(",");
        int[] values = new int [inputSplit.length];

        for(int i = 0; i<inputSplit.length; i++){
            values[i] = Integer.parseInt(inputSplit[i].trim());
        }

        return values;


    }
    private static int findMin(int [] array){
         int min  = Integer.MAX_VALUE;
         for(int el: array){
             if(el<min){
                 min=el;
             }
         }

         return min;

    }

}